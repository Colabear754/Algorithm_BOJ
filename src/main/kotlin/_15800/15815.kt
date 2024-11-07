package _15800

fun main() = with(System.`in`.bufferedReader()) {
    val formula = readLine()
    val stack = ArrayDeque<Int>()
    stack.add(formula[0] - '0')
    for (i in 1..<formula.length) {
        when (formula[i]) {
            '+' -> stack.add(stack.removeLast() + stack.removeLast())
            '-' -> stack.add(stack.removeLast().let { stack.removeLast() - it })
            '*' -> stack.add(stack.removeLast() * stack.removeLast())
            '/' -> stack.add(stack.removeLast().let { stack.removeLast() / it })
            else -> stack.add(formula[i] - '0')
        }
    }
    println(stack.removeLast())
}
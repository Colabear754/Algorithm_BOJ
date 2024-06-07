package _03900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0
    repeat(n) {
        val stack = ArrayDeque<Char>()
        val string = readLine()
        for (char in string) {
            if (stack.lastOrNull() == char) {
                stack.removeLast()
                continue
            }
            stack.add(char)
        }
        if (stack.isEmpty()) {
            count++
        }
    }
    println(count)
}
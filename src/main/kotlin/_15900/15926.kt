package _15900

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val string = readLine()
    val stack = ArrayDeque<Int>().apply { addLast(-1) }
    var length = 0
    for (i in string.indices) {
        if (string[i] == '(') {
            stack.addLast(i)
            continue
        }
        stack.removeLast()
        if (stack.isNotEmpty()) length = maxOf(length, i - stack.last())
        else stack.addLast(i)
    }
    println(length)
}
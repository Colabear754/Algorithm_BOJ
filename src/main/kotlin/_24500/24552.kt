package _24500

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    var open = 0
    var close = 0
    var sub = 0
    for (c in str) {
        when (c) {
            '(' -> {
                open++
                sub++
            }
            ')' -> {
                close++
                sub--
            }
        }
        if (sub < 0) {
            println(close)
            return@with
        }
        if (sub == 0) {
            open = 0
        }
    }
    println(open)
}
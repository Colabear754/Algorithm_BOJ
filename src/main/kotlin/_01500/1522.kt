package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val string = readLine()
    val length = string.length
    val aCount = string.count { it == 'a' }
    var start = 0
    var min = Int.MAX_VALUE
    var count = (0..<aCount).count { string[it] == 'b' }
    while (start < length) {
        if (string[(start + aCount) % length] == 'b') count++
        if (string[start++] == 'b') count--
        min = minOf(min, count)
    }
    println(min)
}
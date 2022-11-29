package _15800

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val str = readLine()
    var hash = 0L
    for (i in str.indices) {
        var tmp = (str[i] - '`').toLong()
        repeat(i) {
            tmp *= 31
            tmp %= 1234567891
        }
        hash += tmp
        hash %= 1234567891
    }
    println(hash)
}
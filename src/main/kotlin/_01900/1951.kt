package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var result = 0L
    var current = 1L
    var length = 1
    while (current <= n) {
        val next = minOf(n, current * 10 - 1)
        result += ((next - current + 1) * length) % 1234567L
        result %= 1234567L
        current *= 10L
        length++
    }
    println(result)
}
package _27900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toLong() }
    var result = 0L
    var start = 1L
    var pow10 = 10L
    while (start <= n) {
        val end = minOf(n, pow10 - 1)
        for (i in start..end) {
            result = (result * pow10 + i) % k
        }
        start = pow10
        pow10 *= 10L
    }
    println(result)
}

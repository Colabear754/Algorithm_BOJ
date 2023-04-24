package _14500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a) = readLine().split(' ').map { it.toLong() }
    val (x, y, gcd) = exGcd(n, a)
    println("${n - a} ${if (gcd == 1L) (if (y < 0) y + n else y) else -1}")
}

private fun exGcd(a: Long, b: Long): Triple<Long, Long, Long> =
    if (b == 0L) Triple(1, 0, a) else {
        val (x, y, gcd) = exGcd(b, a % b)
        Triple(y, x - (a / b) * y, gcd)
    }
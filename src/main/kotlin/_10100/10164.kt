package _10100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    if (k == 0) {
        println(binomialCoefficient(n - 1, m - 1))
        return@with
    }
    val r = (k - 1) / m + 1
    val c = (k - 1) % m + 1
    println(binomialCoefficient(r - 1, c - 1) * binomialCoefficient(n - r, m - c))
}

private fun binomialCoefficient(n: Int, m: Int): Long {
    val k = minOf(n, m)
    var result = 1L
    for (i in 1..k) {
        result = result * (n + m - i + 1) / i
    }
    return result
}
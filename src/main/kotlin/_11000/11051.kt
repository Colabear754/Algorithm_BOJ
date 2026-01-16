package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val factorial = IntArray(n + 1)
    factorial[0] = 1
    for (i in 1..n) {
        factorial[i] = factorial[i - 1] * i % 10007
    }
    println((factorial[n] * ((factorial[k] * factorial[n - k]) % 10007).pow(10005)) % 10007)
}

private fun Int.pow(exp: Int): Int {
    var result = 1
    var base = this
    var exponent = exp
    while (exponent > 0) {
        if (exponent and 1 == 1) {
            result = result * base % 10007
        }
        base = base * base % 10007
        exponent = exponent shr 1
    }
    return result
}
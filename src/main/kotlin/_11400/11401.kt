package _11400

private val Long.mod get() = this % 1000000007

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map(String::toLong)
    println((n.factorial() * ((n - k).factorial() * k.factorial()).mod.power(1000000005)).mod)
}

private fun Long.factorial(): Long {
    var result = 1L
    for (i in 2..this) {
        result = (result * i).mod
    }
    return result
}

private fun Long.power(n: Int): Long {
    var result = 1L
    var base = this
    var exponent = n
    while (exponent > 0) {
        if (exponent % 2 == 1) {
            result = (result * base).mod
        }
        base = (base * base).mod
        exponent /= 2
    }
    return result
}
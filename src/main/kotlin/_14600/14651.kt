package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 1) return@with println(0)
    println((2 * 3L.pow(n - 2)) % 1000000009)
}

private fun Long.pow(n: Int): Long {
    var base = this
    var exp = n
    var result = 1L
    while (exp > 0) {
        if (exp and 1 == 1) {
            result *= base
            result %= 1000000009
        }
        base *= base
        base %= 1000000009
        exp /= 2
    }
    return result
}
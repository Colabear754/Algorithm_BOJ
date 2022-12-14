package _16100

fun main() = with(System.`in`.bufferedReader()) {
    val (x, n) = readLine().split(' ').map { it.toInt() }
    println(when {
        n == 1 -> if (x < 0) "INFINITE" else 0
        n % 2 == 1 -> "ERROR"
        x <= 0 -> 0
        n == 0 -> "INFINITE"
        else -> (x + n / 2 - 1) / (n / 2) - 1
    })
}
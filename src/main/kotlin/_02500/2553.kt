package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 1L
    for (i in 2..n) {
        result *= i
        result %= 1000000000
        while (result % 10 == 0L) {
            result /= 10
        }
    }
    println(result % 10)
}
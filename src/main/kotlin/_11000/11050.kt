package _11000

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    k = minOf(k, n - k)
    var result = 1
    var kFac = 1
    repeat(k) {
        result *= n--
    }
    for (i in 2..k) {
        kFac *= i
    }
    println(result / kFac)
}
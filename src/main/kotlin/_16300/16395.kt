package _16300

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    var result = 1
    for (i in 1..<k) {
        result = result * (n - i) / i
    }
    println(result)
}
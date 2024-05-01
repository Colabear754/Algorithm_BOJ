package _31700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toLong() }
    if (n >= m) {
        println(0)
        return@with
    }
    var result = 1L
    for (i in 2..n) {
        result = (result * i) % m
    }
    println(result)
}
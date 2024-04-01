package _23900

fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readLine().split(' ').map { it.toLong() }
    if (n == 1L) {
        println(-1)
        return@with
    }
    println(k * n / (n - 1) + if ((k * n) % (n - 1) != 0L) 1 else 0)
}
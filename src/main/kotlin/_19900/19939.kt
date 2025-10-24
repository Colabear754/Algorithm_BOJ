package _19900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val minSum = k * (k + 1) / 2
    if (n < minSum) {
        return@with println(-1)
    }
    println(if ((n - minSum) % k == 0) k - 1 else k)
}
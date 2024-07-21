package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val (k, x) = readLine().split(' ').map { it.toInt() }
    println((minOf(b, k + x) - maxOf(a, k - x) + 1).let { if (it <= 0) "IMPOSSIBLE" else it })
}
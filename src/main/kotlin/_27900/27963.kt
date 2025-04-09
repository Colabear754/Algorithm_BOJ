package _27900

fun main() = with(System.`in`.bufferedReader()) {
    val (d1, d2, x) = readLine().split(' ').map { it.toDouble() }
    println(100 / (x / maxOf(d1, d2) + (100 - x) / minOf(d1, d2)))
}

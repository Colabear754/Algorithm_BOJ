package _29700

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, k) = readLine().split(" ").map { it.toInt() }
    repeat(n - k + 1) { sb.append('a') }
    for (i in 1..<k) sb.append('a' + i)
    println(sb)
}
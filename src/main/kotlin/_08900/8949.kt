package _08900

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.padStart(7, '0') }
    val sb = StringBuilder()
    repeat(7) { sb.append((a[it] - '0') + (b[it] - '0')) }
    println(sb.toString().toLong())
}
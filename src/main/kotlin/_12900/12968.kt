package _12900

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c, k) = readLine().split(' ').map { it.toInt() }
    println(if (r and c and 1 == 0 || r and c and 1 == 1 && k == 1) 1 else 0)
}
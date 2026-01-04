package _05500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = IntArray(n) { readLine().toInt() }
    var count = 0
    var current = 0
    repeat(m) {
        count++
        current += readLine().toInt()
        if (current >= n - 1) return@with println(count)
        current += board[current]
        if (current >= n - 1) return@with println(count)
    }
}
package _15500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val lines = Array(2) { readLine() }
    val visited = Array(2) { BooleanArray(n + 1) }
    visited[0][0] = true
    val direction = intArrayOf(1, -1, k)
    val queue = ArrayDeque<Triple<Int, Int, Int>>()
    queue.add(Triple(0, 0, 0))
    while (queue.isNotEmpty()) {
        val (side, position, time) = queue.removeFirst()
        for (i in 0..2) {
            val next = position + direction[i]
            if (next > n) return@with println(1)
            if (next <= time) continue
            val nextSide = if (i != 2) side else (1 - side) and 1
            if (lines[nextSide][next] == '1' && !visited[nextSide][next]) {
                visited[nextSide][next] = true
                queue.add(Triple(nextSide, next, time + 1))
            }
        }
    }
    println(0)
}
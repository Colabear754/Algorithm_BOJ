package _16900

import java.util.StringTokenizer
import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val ladder = HashMap<Int, Int>()
    repeat(readLine().split(' ').sumOf { it.toInt() }) {
        StringTokenizer(readLine()).run { ladder[nextToken().toInt()] = nextToken().toInt() }
    }
    val board = IntArray(101)
    val visited = BooleanArray(101)
    val queue = LinkedList<Int>()
    queue.add(1)
    while (queue.isNotEmpty()) {
        val current = queue.poll()
        if (current == 100) {
            println(board[current])
            return@with
        }
        for (i in 1..6) {
            val next = (current + i).let { ladder[it] ?: it }
            if (next > 100 || visited[next]) continue
            visited[next] = true
            board[next] = if (board[next] == 0) board[current] + 1 else board[next]
            queue.add(next)
        }
    }
}
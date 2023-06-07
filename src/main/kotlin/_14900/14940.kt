package _14900

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val queue = LinkedList<Pair<Int, Int>>()
    val result = Array(n) { IntArray(m) { -1 } }
    val visited = Array(n) { BooleanArray(m) }
    val map = Array(n) { i ->
        StringTokenizer(readLine()).run { IntArray(m) { j ->
            nextToken().toInt().also { if (it == 2) {
                queue.add(i to j)
                result[i][j] = 0
            } }
        } }
    }
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    while (queue.isNotEmpty()) {
        val (x, y) = queue.poll()
        visited[x][y] = true
        for (i in 0..3) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0 until n && ny in 0 until m && !visited[nx][ny] && map[nx][ny] == 1) {
                visited[nx][ny] = true
                result[nx][ny] = result[x][y] + 1
                queue.add(nx to ny)
            }
        }
    }
    result.forEachIndexed { i, ints -> ints.forEachIndexed { j, _ -> if (map[i][j] == 0) result[i][j] = 0 } }
    println(result.joinToString("\n") { it.joinToString(" ") })
}
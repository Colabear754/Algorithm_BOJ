package _07500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-2, -1, 1, 2, 2, 1, -1, -2)
    val dy = intArrayOf(1, 2, 2, 1, -1, -2, -2, -1)
    repeat(readLine().toInt()) {
        val l = readLine().toInt()
        val (x, y) = input(readLine())
        val (tx, ty) = input(readLine())
        val count = Array(l) { IntArray(l) }
        val visited = Array(l) { BooleanArray(l) }
        val queue = ArrayDeque<Pair<Int, Int>>()
        queue.add(x to y)
        visited[x][y] = true
        var result = 0
        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.removeFirst()
            if (cx == tx && cy == ty) {
                result = count[cx][cy]
                break
            }
            for (i in 0..<8) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]
                if (nx in 0..<l && ny in 0..<l && !visited[nx][ny]) {
                    queue.add(nx to ny)
                    count[nx][ny] = count[cx][cy] + 1
                    visited[nx][ny] = true
                }
            }
        }
        bw.write("$result\n")
    }
    bw.close()
}

private fun input(str: String) = StringTokenizer(str).run { IntArray(2) { nextToken().toInt() } }
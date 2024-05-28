package _02400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var highest = 0
    val area = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt().also { highest = maxOf(highest, it) } } } }
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    var max = 0
    for (rain in 0..highest) {
        val visited = Array(n) { BooleanArray(n) }
        var count = 0
        val queue = ArrayDeque<Pair<Int, Int>>()
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (area[i][j] > rain && !visited[i][j]) {
                    count++
                    queue.add(i to j)
                    visited[i][j] = true
                    while (queue.isNotEmpty()) {
                        val (r, c) = queue.removeFirst()
                        for (k in 0..<4) {
                            val nr = r + dr[k]
                            val nc = c + dc[k]
                            if (nr in 0..<n && nc in 0..<n && area[nr][nc] > rain && !visited[nr][nc]) {
                                queue.add(nr to nc)
                                visited[nr][nc] = true
                            }
                        }
                    }
                }
            }
        }
        max = maxOf(max, count)
    }
    println(max)
}
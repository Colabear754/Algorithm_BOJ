package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val paper = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    var max = 0
    var count = 0
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    val queue = ArrayDeque<Pair<Int, Int>>()
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (paper[i][j] == 0) continue
            count++
            queue.add(i to j)
            paper[i][j] = 0
            var area = 1
            while (queue.isNotEmpty()) {
                val (r, c) = queue.removeFirst()
                for (k in 0..<4) {
                    val nr = r + dr[k]
                    val nc = c + dc[k]
                    if (nr in 0..<n && nc in 0..<m && paper[nr][nc] == 1) {
                        queue.add(nr to nc)
                        paper[nr][nc] = 0
                        area++
                    }
                }
            }
            max = maxOf(max, area)
        }
    }
    println("$count\n$max")
}
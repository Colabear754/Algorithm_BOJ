package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    val visited = Array(3) { BooleanArray(3) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    val resultStatus = mutableListOf<Int>()
    repeat(readLine().toInt()) {
        val chocolateBox = Array(3) { readLine() }
        val boxStatus = StringTokenizer(readLine()).run { IntArray(nextToken().toInt()) { nextToken().toInt() } }
        for (i in 0..2) {
            for (j in 0..2) {
                if (chocolateBox[i][j] != 'O' || visited[i][j]) continue
                queue.add(i to j)
                visited[i][j] = true
                var result = 1
                while (queue.isNotEmpty()) {
                    val (r, c) = queue.removeFirst()
                    for (k in 0..3) {
                        val nr = r + dr[k]
                        val nc = c + dc[k]
                        if (nr !in 0..2 || nc !in 0..2) continue
                        if (!visited[nr][nc] && chocolateBox[nr][nc] == 'O') {
                            queue.add(nr to nc)
                            visited[nr][nc] = true
                            result++
                        }
                    }
                }
                resultStatus.add(result)
            }
        }
        resultStatus.sort()
        bw.write(if (resultStatus.contentEquals(boxStatus)) "1\n" else "0\n")
        resultStatus.clear()
        visited.forEach { it.fill(false) }
    }
    bw.close()
}

private fun List<Int>.contentEquals(array: IntArray): Boolean {
    if (size != array.size) return false
    for (i in indices) {
        if (this[i] != array[i]) return false
    }
    return true
}
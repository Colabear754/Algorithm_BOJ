package _06100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, n) = readLine().split(" ").map { it.toInt() }
    var minR = 0
    var minC = 0
    var maxR = 0
    var maxC = 0
    val puddles = Array(n) {
        StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.also { (r, c) ->
            minR = minOf(minR, r - 1)
            maxR = maxOf(maxR, r + 1)
            minC = minOf(minC, c - 1)
            maxC = maxOf(maxC, c + 1)
        }
    }
    val rSize = maxR - minR + 1
    val cSize = maxC - minC + 1
    val puddleMap = Array(rSize) { CharArray(cSize) { '.' } }.apply { this[x - minR][y - minC] = 'B' }
    puddles.forEach { (r, c) -> puddleMap[r - minR][c - minC] = 'M' }
    val queue = ArrayDeque<Movement>().apply { add(Movement(-minR, -minC, 0)) }
    val dr = intArrayOf(0, 0, -1, 1)
    val dc = intArrayOf(-1, 1, 0, 0)
    val visited = Array(rSize) { BooleanArray(cSize) }.apply { this[-minR][-minC] = true }
    while (queue.isNotEmpty()) {
        val (r, c, count) = queue.removeFirst()
        if (puddleMap[r][c] == 'B') return@with println(count)
        for (i in 0..3) {
            val nr = r + dr[i]
            val nc = c + dc[i]
            if (nr in 0..<rSize && nc in 0..<cSize && puddleMap[nr][nc] != 'M' && !visited[nr][nc]) {
                visited[nr][nc] = true
                queue.add(Movement(nr, nc, count + 1))
            }
        }
    }
}

private data class Movement(val r: Int, val c: Int, val count: Int)
package _04400

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(0, 0, -1, 1)
    val dy = intArrayOf(-1, 1, 0, 0)
    var case = 1
    lateinit var n: String
    while (readLine().also { n = it } != "0") {
        val size = n.toInt()
        val cave = Array(size) { StringTokenizer(readLine()).run { IntArray(size) { nextToken().toInt() } } }
        val loss = Array(size) { IntArray(size) { Int.MAX_VALUE } }.also { it[0][0] = cave[0][0] }
        val visited = Array(size) { BooleanArray(size) }.also { it[0][0] = true }
        val queue = PriorityQueue<Position>().apply { add(Position(0, 0, cave[0][0])) }
        while (queue.isNotEmpty()) {
            val current = queue.poll()
            for (i in 0..3) {
                val nr = current.r + dx[i]
                val nc = current.c + dy[i]
                if (nr in 0..<size && nc in 0..<size && !visited[nr][nc]) {
                    visited[nr][nc] = true
                    loss[nr][nc] = current.loss + cave[nr][nc]
                    queue.add(Position(nr, nc, loss[nr][nc]))
                }
            }
        }
        bw.write("Problem ${case++}: ${loss[size - 1][size - 1]}\n")
    }
    bw.close()
}

private class Position(val r: Int, val c: Int, val loss: Int) : Comparable<Position> {
    override fun compareTo(other: Position) = loss - other.loss
}
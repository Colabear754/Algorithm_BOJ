package _14500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = StringTokenizer(readLine()).toIntArray()
    var (r, c, d) = StringTokenizer(readLine()).toIntArray()
    val room = Array(n) { StringTokenizer(readLine()).toIntArray() }
    val dr = intArrayOf(-1, 0, 1, 0)
    val dc = intArrayOf(0, 1, 0, -1)
    var result = 0
    while (true) {
        if (room[r][c] == 0) {
            room[r][c] = -1
            result++
        }
        if ((0..3).all { room[r + dr[it]][c + dc[it]] != 0 }) {
            if (room[r - dr[d]][c - dc[d]] == 1) break
            r -= dr[d]
            c -= dc[d]
            continue
        }
        d = (d + 3) % 4
        if (room[r + dr[d]][c + dc[d]] == 0) {
            r += dr[d]
            c += dc[d]
        }
    }
    println(result)
}

private fun StringTokenizer.toIntArray() = IntArray(countTokens()) { nextToken().toInt() }
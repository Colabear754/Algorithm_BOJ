package _01200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, score, p) = readLine().split(' ').map { it.toInt() }
    if (n == 0) {
        println(1)
        return@with
    }
    val rankingBoard = IntArray(p) { -1 }
    StringTokenizer(readLine()).apply { repeat(n) { i -> rankingBoard[i] = nextToken().toInt() } }
    var rank = -1
    if (score != rankingBoard.last()) {
        for (i in rankingBoard.indices) {
            if (score >= rankingBoard[i]) {
                rank = i + 1
                break
            }
        }
    }
    println(rank)
}
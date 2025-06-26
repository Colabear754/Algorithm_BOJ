package _01700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val paper = Array(n) { IntArray(n) }
    val results = IntArray(3)
    repeat(n) { i ->
        StringTokenizer(readLine()).apply { repeat(n) { j -> paper[i][j] = nextToken().toInt() } }
    }
    cut(0, 0, n, paper, results)
    println(results.joinToString("\n"))
}

private fun cut(r: Int, c: Int, size: Int, paper: Array<IntArray>, results: IntArray) {
    var base = paper[c][r]
    for (i in c until c + size) {
        for (j in r until r + size) {
            if (base != paper[i][j]) {
                base = -2
                break
            }
        }
    }
    if (base != -2) {
        results[base + 1]++
        return
    }
    val newSize = size / 3
    val next = IntArray(3) { it * newSize }
    repeat(3) { i -> repeat(3) { j -> cut(r + next[j], c + next[i], newSize, paper, results) } }
}

package _01200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, x) = readLine().split(' ').map { it.toInt() }
    val arr = Array(n + 1) { IntArray(n + 1) { 100000 } }
    repeat(n) { arr[it + 1][it + 1] = 0 }
    repeat(m) { StringTokenizer(readLine()).apply { arr[toInt()][toInt()] = toInt() } }
    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                arr[i][j] = minOf(arr[i][j], arr[i][k] + arr[k][j])
            }
        }
    }
    var max = 0
    repeat(n) { max = maxOf(max, arr[it + 1][x] + arr[x][it + 1]) }
    println(max)
}

private fun StringTokenizer.toInt() = nextToken().toInt()
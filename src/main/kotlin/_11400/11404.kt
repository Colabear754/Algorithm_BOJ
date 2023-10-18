package _11400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val m = readLine().toInt()
    val arr = Array(n + 1) { IntArray(n + 1) { 100000000 } }
    for (i in 1..n) {
        arr[i][i] = 0
    }
    repeat(m) {
        val (a, b, c) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        arr[a][b] = minOf(arr[a][b], c)
    }
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in 1..n) {
                arr[j][k] = minOf(arr[j][k], arr[j][i] + arr[i][k])
            }
        }
    }
    arr.sliceArray(1..n).forEach { city ->
        city.sliceArray(1..n).forEach { bw.write("${if (it == 100000000) 0 else it} ") }
        bw.newLine()
    }
    bw.close()
}
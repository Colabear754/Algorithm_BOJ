package _09400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val arr = Array(2) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
        if (n == 1) {
            bw.write("${arr.maxOf { it[0] }}\n")
            return@repeat
        }
        arr[0][1] = arr[1][0] + arr[0][1]
        arr[1][1] = arr[0][0] + arr[1][1]
        for (i in 2 until n) {
            arr[0][i] += maxOf(arr[1][i - 1], arr[1][i - 2])
            arr[1][i] += maxOf(arr[0][i - 1], arr[0][i - 2])
        }
        bw.write("${maxOf(arr[0][n - 1], arr[1][n - 1])}\n")
    }
    bw.close()
}
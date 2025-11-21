package _29700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val coordinates = Array(n) { StringTokenizer(readLine()).run { intArrayOf(it + 1, nextToken().toInt(), nextToken().toInt()) } }
        .apply { sortWith(compareBy({ it[1] }, { it[2] })) }
    for (i in 1..<n) {
        bw.appendLine("${coordinates[i - 1][0]} ${coordinates[i][0]}")
    }
    bw.close()
}
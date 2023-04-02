package _14800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val matrix = Array(n + 1) { Array(n + 1) { IntArray(11) } }
    for (i in 1..n) {
        StringTokenizer(readLine()).apply {
            for (j in 1..n) {
                for (k in 1..10) matrix[i][j][k] = matrix[i - 1][j][k] + matrix[i][j - 1][k] - matrix[i - 1][j - 1][k]
                matrix[i][j][nextToken().toInt()]++
            }
        }
    }
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        var count = 0
        for (i in 1..10) {
            val num = matrix[x2][y2][i] - matrix[x1 - 1][y2][i] - matrix[x2][y1 - 1][i] + matrix[x1 - 1][y1 - 1][i]
            if (num > 0) count++
        }
        bw.write("$count\n")
    }
    bw.close()
}
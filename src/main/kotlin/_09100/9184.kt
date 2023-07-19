package _09100

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val w = Array(21) { Array(21) { IntArray(21) } }
    for (i in 0..20) {
        for (j in 0..20) {
            for (k in 0..20) {
                if (i == 0 || j == 0 || k == 0) {
                    w[i][j][k] = 1
                } else if (j in i + 1 until k) {
                    w[i][j][k] = w[i][j][k - 1] + w[i][j - 1][k - 1] - w[i][j - 1][k]
                } else {
                    w[i][j][k] = w[i - 1][j][k] + w[i - 1][j - 1][k] + w[i - 1][j][k - 1] - w[i - 1][j - 1][k - 1]
                }
            }
        }
    }
    var st: StringTokenizer
    while (readLine().also { st = StringTokenizer(it) } != "-1 -1 -1") {
        val (a, b, c) = IntArray(3) { st.nextToken().toInt() }
        bw.write("w($a, $b, $c) = ${if (a <= 0 || b <= 0 || c <= 0) 1 else if (a > 20 || b > 20 || c > 20) w[20][20][20] else w[a][b][c]}\n")
    }
    bw.close()
}
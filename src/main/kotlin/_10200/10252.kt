package _10200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (m, n) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.write("1\n")
        var isToRight = true
        for (i in 0..<m) {
            for (j in 1..<n) {
                bw.write("($i, ${if (isToRight) j else n - j})\n")
            }
            isToRight = !isToRight
        }
        for (i in m - 1 downTo 0) {
            bw.write("($i, 0)\n")
        }
    }
    bw.close()
}
package _01400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val points = Array(4) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
        val distances = HashSet<Int>()
        for (i in 0 until 4) {
            for (j in i + 1 until 4) {
                distances.add((points[i][0] - points[j][0]).pow() + (points[i][1] - points[j][1]).pow())
            }
        }
        bw.write("${if (distances.size == 2) "1" else "0"}\n")
    }
    bw.close()
}

private fun Int.pow() = this * this
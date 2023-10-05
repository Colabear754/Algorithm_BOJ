package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var t = 1
    var n: Int
    while (readLine().toInt().also { n = it } != 0) {
        val paper = Array(n) { StringTokenizer(readLine()).run { Array(n) { nextToken() } } }
        val negative = ArrayList<Pair<String, String>>()
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (paper[i][j] == "N") negative.add(paper[(n + i - j) % n][0] to paper[i][0])
            }
        }
        bw.write("Group ${t++}\n")
        if (negative.isEmpty()) {
            bw.write("Nobody was nasty\n\n")
            continue
        }
        for (case in negative) {
            bw.write("${case.first} was nasty about ${case.second}\n")
        }
        bw.write("\n")
    }
    bw.close()
}
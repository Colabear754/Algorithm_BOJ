package _20500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        if (n > 32) {
            readLine()
            bw.write("0\n")
            return@repeat
        }
        val mbti = StringTokenizer(readLine()).run { Array(n) { nextToken() } }
        var min = Int.MAX_VALUE
        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                for (k in j + 1 until n) {
                    min = minOf(min, distance(mbti[i], mbti[j]) + distance(mbti[j], mbti[k]) + distance(mbti[k], mbti[i]))
                }
            }
        }
        bw.write("$min\n")
    }
    bw.close()
}

private fun distance(a: String, b: String): Int {
    var count = 0
    for (i in a.indices) {
        if (a[i] != b[i]) count++
    }
    return count
}
package _11100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val m = readLine().toInt()
        val left = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
        val right = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
        var count = 0
        for (i in 0..<m) {
            for (j in i..<m) {
                if (left[i] + 500 == left[j] && left[i] + 1000 in right && left[i] + 1500 in right) {
                    count++
                }
            }
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
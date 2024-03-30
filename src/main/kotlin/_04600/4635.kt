package _04600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n: Int
    while (readLine().apply { n = toInt() } != "-1") {
        var time = 0
        var distance = 0
        repeat(n) {
            val (s, t) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
            distance += s * (t - time)
            time = t
        }
        bw.write("$distance miles\n")
    }
    bw.close()
}
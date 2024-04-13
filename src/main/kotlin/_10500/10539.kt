package _10500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    StringTokenizer(readLine()).apply {
        var prev = nextToken().toInt()
        bw.write("$prev ")
        for (i in 2..n) {
            val cur = nextToken().toInt()
            bw.write("${(cur - prev) * i + prev} ")
            prev = cur
        }
    }
    bw.close()
}
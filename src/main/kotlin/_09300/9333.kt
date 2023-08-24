package _09300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var (r, b, m) = StringTokenizer(readLine()).run { LongArray(3) { nextToken().replace(".", "").toLong() } }
        if ((b * r / 1000).let { if (it % 10 >= 5) it / 10 + 1 else it / 10 } >= m) {
            bw.write("impossible\n")
            return@repeat
        }
        var count = 0
        while (b > 0) {
            b += (b * r / 1000).let { if (it % 10 >= 5) it / 10 + 1 else it / 10 }
            b -= m
            count++
            if (count > 1200) {
                bw.write("impossible\n")
                return@repeat
            }
        }
        bw.write("$count\n")
    }
    bw.close()
}
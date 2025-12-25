package _04600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, d, b, e) = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
        bw.write("Problem set ${it + 1}: $n / $d, base 7 digits $b through $e: ")
        var remainder = n % d
        for (i in 0..e) {
            remainder *= 7
            val digit = remainder / d
            if (i >= b) bw.write("$digit")
            remainder %= d
        }
        bw.newLine()
    }
    bw.close()
}
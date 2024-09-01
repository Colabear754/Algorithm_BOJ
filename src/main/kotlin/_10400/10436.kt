package _10400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val t = nextToken().toInt()
            val (p, q) = StringTokenizer(nextToken(), "/").run { LongArray(2) { nextToken().toLong() } }
            bw.write("$t $q/${p + q - 2 * (p % q)}")
            bw.newLine()
        }
    }
    bw.close()
}
package _28600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    bw.write("soccer ".repeat(n))
    bw.newLine()
    bw.flush()
    StringTokenizer(readLine()).run {
        while (hasMoreTokens()) {
            bw.write(when (nextToken()) {
                "swimming" -> "bowling "
                else -> "swimming "
            })
        }
    }
    bw.close()
}
package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine(), " ", true).apply { while (hasMoreTokens()) { bw.write(nextToken().reversed()) } }
        bw.newLine()
    }
    bw.close()
}
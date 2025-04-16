package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${Array(readLine().toInt()) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
            .apply { sortWith(compareBy({ it[1].toDouble() / it[0] }, { it[1] })) }.first()[1]}")
        bw.newLine()
    }
    bw.close()
}
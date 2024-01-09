package _25200

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val yyyy_MM_dd = DateTimeFormatter.ofPattern("yyyy M dd")
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val y = nextToken().toInt()
            val m = nextToken().toInt()
            bw.write("${LocalDate.of(y, m, m).minusDays(m.toLong()).format(yyyy_MM_dd)}\n")
        }
    }
    bw.close()
}
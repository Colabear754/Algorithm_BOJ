package _27900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var plusResult = 0L
    var multiplyResult = 1L
    var min = 1L
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "0" -> plusResult += nextToken().toLong()
                "1" -> multiplyResult *= nextToken().toLong().also { plusResult *= it }
                "2" -> min += nextToken().toLong()
                "3" -> bw.write("${min * multiplyResult + plusResult}\n")
            }
        }
    }
    bw.close()
}
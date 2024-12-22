package _32100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var result = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply { result += nextToken().toInt() - nextToken().toInt() }
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}
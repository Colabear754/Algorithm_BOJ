package _09200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            bw.write("Case ${it + 1}: ${nextToken().toInt() + nextToken().toInt()}\n")
        }
    }
    bw.close()
}
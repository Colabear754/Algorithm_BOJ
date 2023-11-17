package _09500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, d) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.write("${Array(n) { StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } } }.count { (v, f, c) -> v * f / c >= d }}\n")
    }
    bw.close()
}
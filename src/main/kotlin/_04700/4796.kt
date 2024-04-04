package _04700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var i = 1
    lateinit var input: String
    while (readLine().also { input = it } != "0 0 0") {
        val (l, p, v) = StringTokenizer(input).run { IntArray(3) { nextToken().toInt() } }
        val result = (v / p) * l + minOf(v % p, l)
        bw.write("Case ${i++}: $result\n")
    }
    bw.close()
}
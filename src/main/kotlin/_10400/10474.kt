package _10400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0 0") {
        val (a, b) = StringTokenizer(input).run { IntArray(2) { nextToken().toInt() } }
        bw.write("${a / b} ${a % b} / $b\n")
    }
    bw.close()
}
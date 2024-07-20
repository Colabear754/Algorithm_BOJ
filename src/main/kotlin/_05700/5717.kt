package _05700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input:String
    while (readLine().also { input = it } != "0 0") {
        StringTokenizer(input).apply {
            bw.write("${nextToken().toInt() + nextToken().toInt()}\n")
        }
    }
    bw.close()
}
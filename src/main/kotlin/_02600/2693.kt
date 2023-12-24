package _02600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${StringTokenizer(readLine()).run { IntArray(10) { nextToken().toInt() }.sortedArray()[7] }}\n")
    }
    bw.close()
}
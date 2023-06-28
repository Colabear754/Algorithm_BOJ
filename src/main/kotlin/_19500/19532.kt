package _19500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val input = StringTokenizer(readLine()).run { IntArray(6) { nextToken().toInt() } }
    val k = input[0] * input[4] - input[1] * input[3]
    println("${(input[4] * input[2] - input[1] * input[5]) / k} ${(input[0] * input[5] - input[2] * input[3]) / k}")
}
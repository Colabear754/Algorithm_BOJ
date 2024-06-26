package _23600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bitCount = IntArray(20)
    val n = readLine().toInt()
    StringTokenizer(readLine()).apply {
        repeat(n) {
            var number = nextToken().toInt()
            var index = 0
            while (number > 0) {
                bitCount[index++] += number and 1
                number = number shr 1
            }
        }
    }
    println(bitCount.max())
}
package _03000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val correct = mutableMapOf<String, Int>()
    StringTokenizer(readLine()).apply { repeat(n) { correct[nextToken()] = it } }
    val answer = StringTokenizer(readLine()).run { IntArray(n) { correct[nextToken()] ?: -1 } }
    var score = 0
    for (i in 0..<n) {
        for (j in i + 1..<n) {
            if (answer[i] < answer[j]) score++
        }
    }
    println("$score/${n * (n - 1) / 2}")
}
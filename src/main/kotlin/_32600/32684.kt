package _32600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val scores = intArrayOf(13, 7, 5, 3, 3, 2)
    val cho = StringTokenizer(readLine()).run {
        var sum = 0
        repeat(6) { sum += scores[it] * nextToken().toInt() }
        sum
    }
    val han = StringTokenizer(readLine()).run {
        var sum = 0
        repeat(6) { sum += scores[it] * nextToken().toInt() }
        sum + 1.5
    }
    println(if (cho > han) "cocjr0208" else "ekwoo")
}
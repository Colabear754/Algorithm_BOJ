package _23300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (onehand, nolook, phone) = readLine().split(' ').map { it.toInt() }
    val n = readLine().toInt()
    var max = 0
    repeat(n) {
        var score = 0
        repeat(3) {
            StringTokenizer(readLine()).apply {
                IntArray(3) { nextToken().toInt() }.also { arr -> score += arr[0] * onehand + arr[1] * nolook + arr[2] * phone }
            }
        }
        max = maxOf(max, score)
    }
    println(max)
}
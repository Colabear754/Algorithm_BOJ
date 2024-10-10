package _02500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val grading = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var score = 0
    var combo = 0
    for (isSolve in grading) {
        if (isSolve == 1) {
            combo++
            score += combo
            continue
        }
        combo = 0
    }
    println(score)
}
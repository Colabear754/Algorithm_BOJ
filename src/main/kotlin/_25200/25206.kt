package _25200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var totalScore = 0.0
    var totalRating = 0.0
    repeat(20) {
        StringTokenizer(readLine()).run {
            nextToken()
            val rating = nextToken().toDouble()
            val grade = when (nextToken()) {
                "A+" -> 4.5
                "A0" -> 4.0
                "B+" -> 3.5
                "B0" -> 3.0
                "C+" -> 2.5
                "C0" -> 2.0
                "D+" -> 1.5
                "D0" -> 1.0
                "F" -> 0.0
                else -> -1.0
            }
            if (grade != -1.0) {
                totalScore += rating * grade
                totalRating += rating
            }
        }
    }
    println(totalScore / totalRating)
}
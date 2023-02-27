package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val maxScore = IntArray(n + 1)
    val score = IntArray(n + 1)
    for (i in 1..n) score[i] = readLine().toInt()
    maxScore[1] = score[1]
    if (n >= 2) maxScore[2] = score[2] + score[1]
    for (i in 3..n) maxScore[i] = maxOf(maxScore[i - 2], maxScore[i - 3] + score[i - 1]) + score[i]
    println(maxScore[n])
}
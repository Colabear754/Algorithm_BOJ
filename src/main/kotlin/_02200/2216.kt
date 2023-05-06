package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c) = readLine().split(' ').map { it.toInt() }
    val str1 = readLine()
    val str2 = readLine()
    val score = Array(str1.length + 1) { IntArray(str2.length + 1) }
    for (i in 1..str1.length) score[i][0] = score[i - 1][0] + b
    for (i in 1..str2.length) score[0][i] = score[0][i - 1] + b
    for (i in 1..str1.length) {
        for (j in 1..str2.length) {
            if (str1[i - 1] == str2[j - 1]) {
                score[i][j] = score[i - 1][j - 1] + a
            } else {
                score[i][j] = score[i - 1][j - 1] + c
            }
            score[i][j] = maxOf(maxOf(score[i][j], score[i][j - 1] + b), score[i - 1][j] + b)
        }
    }
    println(score[str1.length][str2.length])
}
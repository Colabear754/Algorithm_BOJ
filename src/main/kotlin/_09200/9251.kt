package _09200

fun main() = with(System.`in`.bufferedReader()) {
    val str1 = readLine()
    val str2 = readLine()
    val length1 = str1.length
    val length2 = str2.length
    val dp = Array(length1 + 1) { IntArray(length2 + 1) }
    for (i in 1..length1) {
        for (j in 1..length2) {
            dp[i][j] =
                if (str1[i - 1] == str2[j - 1]) dp[i - 1][j - 1] + 1
                else maxOf(dp[i - 1][j], dp[i][j - 1])
        }
    }
    println(dp[length1][length2])
}
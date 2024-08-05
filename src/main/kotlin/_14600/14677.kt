package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val medicine = readLine()
    val lastIndex = 3 * n
    if (medicine.first() != 'B' && medicine.last() != 'B') {
        println(0)
        return@with
    }
    val dp = Array(lastIndex + 1) { IntArray(lastIndex + 1) { -1500 } }
    if (medicine.first() == 'B') dp[1][0] = 1
    if (medicine.last() == 'B') dp[0][1] = 1
    val order = charArrayOf('D', 'B', 'L')
    for (i in 2..lastIndex) {
        if (medicine[lastIndex - i] == order[i % 3]) dp[0][i] = dp[0][i - 1] + 1
        if (medicine[i - 1] == order[i % 3]) dp[i][0] = dp[i - 1][0] + 1
        for (j in 1..<i) {
            if (medicine[j - 1] == order[i % 3] && medicine[lastIndex - i + j] == order[i % 3]) dp[j][i - j] = maxOf(dp[j - 1][i - j], dp[j][i - j - 1]) + 1
            else if (medicine[j - 1] == order[i % 3]) dp[j][i - j] = dp[j - 1][i - j] + 1
            else if (medicine[lastIndex - i + j] == order[i % 3]) dp[j][i - j] = dp[j][i - j - 1] + 1
        }
    }
    println(dp.maxOf { it.max() })
}
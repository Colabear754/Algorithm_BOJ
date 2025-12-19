package _19600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val attendees = IntArray(n) { readLine().split(' ').last().toInt() }
    val dp = IntArray(n)
    dp[0] = attendees[0]
    if (n > 1) dp[1] = maxOf(attendees[0], attendees[1])
    for (i in 2..<n) {
        dp[i] = maxOf(dp[i - 1], dp[i - 2] + attendees[i])
    }
    println(dp.last())
}
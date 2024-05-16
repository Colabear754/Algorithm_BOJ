package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val dp = LongArray(1000001)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..1000000) {
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009
    }
    repeat(readLine().toInt()) {
        bw.write("${dp[readLine().toInt()]}")
        bw.newLine()
    }
    bw.close()
}
package _09700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val input = IntArray(readLine().toInt()) { readLine().toInt() }
    val max = input.max()
    val dp = Array(max + 1) { i -> IntArray(max + 1) { if (i == 0) 1 else 0 } }
    for (i in 1..max) {
        for (j in 1..max) {
            dp[i][j] = if (i < j) dp[i][j - 1] else (dp[i][j - 1] + dp[i - j][j - 1]) % 100999
        }
    }
    input.forEach { bw.write("${dp[it][it]}\n") }
    bw.close()
}
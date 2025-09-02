package _29700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val damages = LongArray(n) { readLine().toLong() }.apply { sort() }
    val bosses = Array(k) { StringTokenizer(readLine()).run { LongArray(2) { nextToken().toLong() } } }
    var result = 0
    val dp = IntArray(901)
    for (i in n - 1 downTo n - m) {
        for (j in bosses.indices) {
            val time = (bosses[j][0] + damages[i] - 1) / damages[i]
            if (time > 900) continue
            for (k in dp.indices.reversed()) {
                if (k < time) break
                dp[k] = maxOf(dp[k], dp[k - time.toInt()] + bosses[j][1].toInt())
            }
        }
        result += dp[900]
        dp.fill(0)
    }
    println(result)
}
package _17600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val weight = StringTokenizer(readLine()).run { IntArray(k) { nextToken().toInt() } }
    val sum = weight.sum()
    val dp = BooleanArray(sum + 1)
    dp[0] = true
    fun compareWeight(i: Int, w: Int) {
        if (i == k) {
            if (w in 1..sum) dp[w] = true
            return
        }
        compareWeight(i + 1, w + weight[i])
        compareWeight(i + 1, w - weight[i])
        compareWeight(i + 1, w)
    }
    compareWeight(0, 0)
    println(dp.count { !it })
}
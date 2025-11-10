package _14700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val min = minOf(n, m)
    val max = maxOf(n, m)
    val maxSize = 1 shl min
    var dp = IntArray(maxSize) { 1 }
    var next = IntArray(maxSize)
    repeat(max - 1) {
        next.fill(0)
        for (i in 0..<maxSize) {
            if (dp[i] == 0) continue
            for (j in 0..<maxSize) {
                if ((i and (i shl 1) and j and (j shl 1)) == 0) {
                    next[j] += dp[i]
                }
            }
        }
        dp = next.also { next = dp }
    }
    println(dp.sum())
}
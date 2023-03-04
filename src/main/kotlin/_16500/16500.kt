package _16500

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    val a = Array(readLine().toInt()) { readLine() }
    val dp = BooleanArray(s.length + 1)
    dp[s.length] = true
    for (i in s.length - 1 downTo 0) {
        for (j in a.indices) {
            if (i + a[j].length <= s.length && s.substring(i, i + a[j].length) == a[j]) {
                dp[i] = dp[i] || dp[i + a[j].length]
            }
        }
    }
    println(if (dp[0]) 1 else 0)
}
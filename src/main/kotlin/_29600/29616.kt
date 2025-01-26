package _29600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, p) = readLine().split(' ').map { it.toInt() }
    val pastVote = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val past = pastVote.totalVote
    val nowVote = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val now = nowVote.totalVote
    var multiply = 1
    while (true) {
        var flag = true
        for (i in 0..<n) {
            if (nowVote[i] * multiply < pastVote[i]) {
                flag = false
                break
            }
        }
        if (flag) break
        multiply++
    }
    println("$past ${now * multiply}")
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)
private val LongArray.totalVote get(): Long {
    val gcd = reduce { acc, num -> gcd(acc, num) }
    for (i in indices) this[i] /= gcd
    return sum()
}
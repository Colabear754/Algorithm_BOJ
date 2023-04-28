package _21800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val beauty = readLine().toInt().let { StringTokenizer(readLine()).run { IntArray(it) { nextToken().toInt() } } }
    println(beauty.maxOfGcdSum(0, beauty.size - 1))
}

private fun IntArray.maxOfGcdSum(start: Int, end: Int): Long {
    if (start == end) return this[start].toLong()
    val mid = (start + end + 1) / 2
    val leftSum = arrayGcd(start, mid - 1) + maxOfGcdSum(mid, end)
    val rightSum = arrayGcd(mid, end) + maxOfGcdSum(start, mid - 1)
    return maxOf(leftSum, rightSum)
}

private fun IntArray.arrayGcd(start: Int, end: Int): Int {
    var gcd = this[start]
    for (i in start..end) {
        gcd = gcd(gcd, this[i])
    }
    return gcd
}

private fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)

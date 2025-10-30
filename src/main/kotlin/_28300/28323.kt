package _28300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { BooleanArray(n) { nextToken().toInt() and 1 == 1 } }
        val ans = maxOf(array.findLongestSequence(true), array.findLongestSequence(false))
    println(ans)
}

private fun BooleanArray.findLongestSequence(start: Boolean): Int {
    var prev = start
    var count = 0
    forEach { if (it == prev) {
        count++
        prev = !prev
    } }
    return count
}
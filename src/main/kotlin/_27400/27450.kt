package _27400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val p = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val t = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val additionalPower = IntArray(n + 1)
    val speech = ArrayDeque<Int>().apply { repeat(k) { add(0) } }
    var effectiveShout = 0
    var shout = 0L
    for (i in 1..n) {
        additionalPower[i] = additionalPower[i - 1] - effectiveShout
        p[i] += additionalPower[i]
        val count = if (t[i] <= p[i]) 0 else (t[i] - p[i]) / k + if ((t[i] - p[i]) % k == 0) 0 else 1
        shout += count
        effectiveShout += count
        speech.add(count)
        additionalPower[i] += (count * k).also { p[i] += it }
        effectiveShout -= speech.removeFirst()
    }
    println(shout)
}
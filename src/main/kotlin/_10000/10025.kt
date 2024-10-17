package _10000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val iceBucket = IntArray(1000001)
    repeat(n) { StringTokenizer(readLine()).run { nextToken().toInt().let { g -> iceBucket[nextToken().toInt()] = g } } }
    if (k >= 500000) {
        println(iceBucket.sum())
        return@with
    }
    var sum = 0
    for (i in 1..2 * k + 1) sum += iceBucket[i]
    var result = sum
    var left = 1
    for (right in 2 * k + 2..1000000) {
        sum -= iceBucket[left++]
        sum += iceBucket[right]
        result = maxOf(result, sum)
    }
    println(result)
}
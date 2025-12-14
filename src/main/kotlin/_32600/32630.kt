package _32600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    var min1 = Long.MAX_VALUE
    var min2 = Long.MAX_VALUE
    var max1 = Long.MIN_VALUE
    var max2 = Long.MIN_VALUE
    var sum = 0L
    for (num in array) {
        sum += num
        if (num <= min1) min2 = min1.also { min1 = num }
        else if (num < min2) min2 = num
        if (num >= max1) max2 = max1.also { max1 = num }
        else if (num > max2) max2 = num
    }
    println(maxOf(sum, sum - min1 - min2 + 2 * (min1 * min2), sum - max1 - max2 + 2 * (max1 * max2)))
}
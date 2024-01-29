package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    if (m >= 200000) {
        println(0)
        return@with
    }
    val material = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.sortedArray()
    var count = 0
    var left = 0
    var right = n - 1
    while (left < right) {
        val sum = material[left] + material[right]
        when {
            sum == m -> {
                count++
                left++
                right--
            }
            sum < m -> left++
            else -> right--
        }
    }
    println(count)
}
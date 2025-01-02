package _20900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val count = IntArray(100001)
    var result = 0
    var left = 0
    var right = 0
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    while (right < n) {
        count[arr[right]]++
        while (count[arr[right]] > k) {
            count[arr[left]]--
            left++
        }
        result = maxOf(result, right - left + 1)
        right++
    }
    println(result)
}
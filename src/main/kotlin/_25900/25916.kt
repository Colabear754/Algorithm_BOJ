package _25900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val holes = IntArray(n) { st.nextToken().toInt() }
    var start = 0
    var end = 0
    var max = 0
    var sum = 0
    while (end < n) {
        if (sum + holes[end] <= m) {
            sum += holes[end]
            max = maxOf(max, sum)
            end++
        } else {
            sum -= holes[start]
            start++
        }
        if (start > end) {
            sum += holes[end]
            end++
        }
    }
    println(max)
}
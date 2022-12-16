package _01800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, s) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val arr = IntArray(n + 1)
    val sum = IntArray(n + 1)
    repeat(n) { i ->
        arr[i + 1] = st.nextToken().toInt().also { n -> sum[i + 1] = sum[i] + n }
    }
    var minLength = 100001
    var start = 0
    var end = 1
    while (end <= n) {
        if (sum[end] - sum[start] >= s) {
            minLength = minOf(minLength, end - start)
            start++
        } else {
            end++
        }
    }
    println(if (minLength == 100001) 0 else minLength)
}
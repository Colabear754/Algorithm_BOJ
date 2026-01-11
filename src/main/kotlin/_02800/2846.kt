package _02800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val height = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var start = height[0]
    var max = 0
    for (i in 1..<n) {
        if (height[i] > height[i - 1]) {
            max = maxOf(max, height[i] - start)
            continue
        }
        start = height[i]
    }
    println(max)
}
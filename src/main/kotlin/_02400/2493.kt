package _02400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val height = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val deque = ArrayDeque<IntArray>()
    val result = IntArray(n) { 0 }
    for (i in height.indices) {
        while (deque.isNotEmpty() && deque.last()[1] < height[i]) {
            deque.removeLast()
        }
        result[i] = if (deque.isEmpty()) 0 else deque.last()[0] + 1
        deque.add(intArrayOf(i, height[i]))
    }
    println(result.joinToString(" "))
}
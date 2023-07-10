package _01000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val deque = ArrayDeque<Int>().apply { for (i in 1..n) add(i) }
    val arr = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    var count = 0
    for (num in arr) {
        val left = deque.indexOf(num)
        val right = deque.size - left
        count += if (left < right) left else right
        if (left < right) repeat(left) { deque.addLast(deque.removeFirst()) }
        else repeat(right) { deque.addFirst(deque.removeLast()) }
        deque.removeFirst()
    }
    println(count)
}
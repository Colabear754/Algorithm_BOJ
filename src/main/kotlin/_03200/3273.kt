package _03200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val deque = ArrayDeque<Int>()
    StringTokenizer(readLine()).apply { while(hasMoreTokens()) deque.add(nextToken().toInt()) }
    deque.sort()
    if (deque.size == 1) {
        println(0)
        return@with
    }
    val x = readLine().toInt()
    var start = deque.removeFirst()
    var end = deque.removeLast()
    var count = 0
    while (deque.isNotEmpty()) {
        if (start + end == x) {
            count++
            end = deque.removeLast()
        } else if (start + end > x) {
            end = deque.removeLast()
        } else {
            start = deque.removeFirst()
        }
    }
    if (start + end == x) count++
    println(count)
}
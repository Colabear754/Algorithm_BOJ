package _01600

import java.util.Queue
import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val isVisited = BooleanArray(100001)
    val time = IntArray(100001)
    val queue: Queue<Int> = LinkedList()
    queue.add(n)
    isVisited[n] = true

    while (queue.isNotEmpty()) {
        val cur = queue.poll()
        if (cur == k) {
            println(time[k])
            return@with
        }

        if (cur > 0 && !isVisited[cur - 1]) {
            isVisited[cur - 1] = true
            time[cur - 1] = time[cur] + 1
            queue.add(cur - 1)
        }
        if (cur + 1 <= isVisited.lastIndex && !isVisited[cur + 1]) {
            isVisited[cur + 1] = true
            time[cur + 1] = time[cur] + 1
            queue.add(cur + 1)
        }
        if (cur * 2 <= isVisited.lastIndex && !isVisited[cur * 2]) {
            isVisited[cur * 2] = true
            time[cur * 2] = time[cur] + 1
            queue.add(cur * 2)
        }
    }
}
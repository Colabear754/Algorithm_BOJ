package _18500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val visited = mutableSetOf<Int>()
    val queue = ArrayDeque<Pair<Int, Long>>()
    StringTokenizer(readLine()).apply { IntArray(n) { nextToken().toInt().also { visited.add(it); queue.add(it to 0L) } } }
    var unhappinessSum = 0L
    var count = 0
    val dx = intArrayOf(-1, 1)
    while (queue.isNotEmpty()) {
        val (current, unhappiness) = queue.removeFirst()
        for (x in dx) {
            val next = current + x
            if (!visited.add(next)) continue
            unhappinessSum += unhappiness + 1
            count++
            if (count == k) {
                print(unhappinessSum)
                return@with
            }
            queue.add(next to unhappiness + 1)
        }
    }
}
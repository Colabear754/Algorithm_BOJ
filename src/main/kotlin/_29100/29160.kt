package _29100

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val playersPosition = Array(11) { PriorityQueue<Int>(reverseOrder()) }
    repeat(n) { StringTokenizer(readLine()).apply { playersPosition[nextInt() - 1].add(nextInt()) } }
    repeat(k) {
        for (players in playersPosition) {
            if (players.isEmpty()) continue
            players.add(players.poll() - 1)
        }
    }
    println(playersPosition.sumOf { it.poll() ?: 0 })
}

private fun StringTokenizer.nextInt() = nextToken().toInt()
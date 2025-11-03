package _17200

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, n) = readLine().split(' ').map { it.toInt() }
    val timeTable = PriorityQueue<Pair<Int, Boolean>>(compareBy({ it.first }, { if (it.second) -1 else 1 }))
    var sangminTime = 0
    var jisuTime = 0
    repeat(n) {
        StringTokenizer(readLine()).apply {
            val time = nextToken().toInt()
            val isSangmin = nextToken()[0] == 'B'
            val count = nextToken().toInt()
            val start = maxOf(time, if (isSangmin) sangminTime else jisuTime)
            val step = if (isSangmin) a else b
            repeat(count) { i -> timeTable.add(start + i * step to isSangmin) }
            if (isSangmin) sangminTime = start + step * count else jisuTime = start + step * count
        }
    }
    var present = 1
    val sangmin = mutableListOf<Int>()
    val jisu = mutableListOf<Int>()
    while (timeTable.isNotEmpty()) {
        val (_, isSangmin) = timeTable.poll()
        if (isSangmin) sangmin.add(present++)
        else jisu.add(present++)
    }
    println("${sangmin.size}\n${sangmin.joinToString(" ")}\n${jisu.size}\n${jisu.joinToString(" ")}")
}
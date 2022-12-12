package _26200

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val snow = PriorityQueue<Int>(reverseOrder())
    var minute = 0
    readLine()
    StringTokenizer(readLine()).run {
        while (hasMoreTokens()) {
            nextToken().toInt().let {
                if (it > 1440) {
                    println(-1)
                    return@with
                }
                snow.add(it)
            }
        }
    }

    while (snow.size > 1) {
        val max = snow.poll()!!
        val secondMax = snow.poll() ?: 0
        snow.add(max - secondMax)
        minute += secondMax
    }
    minute += snow.poll() ?: 0
    println(if (minute > 1440) -1 else minute)
}
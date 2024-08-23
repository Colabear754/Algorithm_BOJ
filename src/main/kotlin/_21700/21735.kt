package _21700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val a = intArrayOf(0) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    fun rollSnowBall(position: Int, time: Int, size: Int): Int {
        if (position >= n) return size
        if (time == m) return size
        return maxOf(
            rollSnowBall(position + 1, time + 1, size + a[position + 1]),
            if (position + 2 > n) 0 else rollSnowBall(position + 2, time + 1, size / 2 + a[position + 2])
        )
    }
    println(rollSnowBall(0, 0, 1))
}
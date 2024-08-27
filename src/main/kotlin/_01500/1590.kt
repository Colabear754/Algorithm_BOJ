package _01500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(' ').map { it.toInt() }
    val buses = ArrayList<Int>()
    repeat(n) {
        val (s, i, c) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        repeat(c) { j -> (s + i * j).let { bus -> if (bus >= t) buses.add(bus) } }
    }
    buses.sort()
    println(if (buses.isEmpty()) -1 else buses[0] - t)
}
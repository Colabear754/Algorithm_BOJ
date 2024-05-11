package _31700

import java.util.StringTokenizer
import java.util.TreeMap

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val hands = TreeMap<Int, Int>()
    repeat(m) { StringTokenizer(readLine()).apply { while (hasMoreTokens()) hands[nextToken().toInt()] = it + 1 } }
    val apartment = intArrayOf(hands.lastEntry().value) + IntArray(m * 2)
    var index = 1
    hands.forEach { (_, v) -> apartment[index++] = v }
    println(apartment[n % (m * 2)])
}
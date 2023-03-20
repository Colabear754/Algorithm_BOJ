package _23700

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val presents = PriorityQueue<Int>(reverseOrder()).apply {
        StringTokenizer(readLine()).apply { repeat(n) { add(nextToken().toInt()) } }
    }
    val children = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }
    for (i in children.indices) {
        if (presents.peek() - children[i] < 0) {
            println(0)
            return@with
        }
        presents.add(presents.poll() - children[i])
    }
    println(1)
}
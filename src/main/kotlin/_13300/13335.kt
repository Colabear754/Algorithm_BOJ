package _13300

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, w, l) = readLine().split(' ').map { it.toInt() }
    val trucks = StringTokenizer(readLine()).run { LinkedList<Int>().apply { repeat(n) { add(nextToken().toInt()) } } }
    val bridge = IntArray(w)
    var time = 0
    var weight = 0
    while (trucks.isNotEmpty()) {
        time++
        weight -= bridge[0]
        for (i in 0 until w - 1) bridge[i] = bridge[i + 1]
        if (weight + trucks.peek() <= l) {
            bridge[w - 1] = trucks.peek()
            weight += trucks.poll()
        } else {
            bridge[w - 1] = 0
        }
    }
    println(time + w)
}
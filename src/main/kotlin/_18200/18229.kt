package _18200

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val array = Array(n) { StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } } }
    val hands = IntArray(n)
    var person = 0
    var count = 0
    while (true) {
        hands[person] += array[person][count]
        if (hands[person] >= k) {
            println("${person + 1} ${count + 1}")
            return@with
        }
        person++
        person %= n
        if (person == 0) count++
    }
}
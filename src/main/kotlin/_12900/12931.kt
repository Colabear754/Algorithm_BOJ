package _12900

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    while (true) {
        array = array.map {
            if (it % 2 == 1) {
                count++
                it - 1
            } else {
                it
            }
        }.toIntArray()

        if (array.count { it != 0 } == 0) break

        array = array.map { it / 2 }.toIntArray()
        count++
    }
    println(count)
}
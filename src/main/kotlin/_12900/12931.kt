package _12900

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    while (true) {
        for (i in array.indices) {
            if (array[i] % 2 == 1) {
                count++
                array[i]--
            }
        }

        if (array.count { it != 0 } == 0) break

        for (i in array.indices) {
            array[i] /= 2
        }
        count++
    }
    println(count)
}
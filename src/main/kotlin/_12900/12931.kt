package _12900

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var count = 0
    while (true) {
        var isClear = true
        var isChanged = false
        array = array.map {
            if (it != 0) isClear = false
            if (it % 2 == 1) {
                isChanged = true
                count++
                it - 1
            } else {
                it
            }
        }.toIntArray()

        if (isClear) break

        if (!isChanged) {
            array = array.map {
                if (it != 0) isClear = false
                it / 2
            }.toIntArray()
            count++
        }
    }
    println(count)
}
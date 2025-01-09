package _02300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pillars = IntArray(1001)
    var max = 0
    var maxPosition = 0
    repeat(n) {
        StringTokenizer(readLine()).run {
            val l = nextToken().toInt()
            pillars[l] = nextToken().toInt().also {
            if (it > max) {
                max = it
                maxPosition = l
            }
        } }
    }
    var current = 0
    var result = max
    for (i in 0..<maxPosition) {
        if (pillars[i] > current) {
            current = pillars[i]
        }
        result += current
    }
    current = 0
    for (i in 1000 downTo maxPosition + 1) {
        if (pillars[i] > current) {
            current = pillars[i]
        }
        result += current
    }
    println(result)
}
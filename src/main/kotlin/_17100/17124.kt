package _17100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val (n, m) = readLine().split(' ').map { it.toInt() }
        val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        val b = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }.sortedArray()
        var index: Int
        var result = 0L
        for (num in a) {
            index = b.binarySearch(num)
            if (index >= 0) {
                result += b[index]
                continue
            }
            index = (-index - 1)
            if (index >= m) index--
            result += if (index == 0) b[index] else if (num - b[index - 1] <= b[index] - num) b[index - 1] else b[index]
        }
        sb.append(result).append('\n')
    }
    println(sb)
}
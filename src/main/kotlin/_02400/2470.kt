package _02400

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val ph = IntArray(n) { st.nextToken().toInt() }.sortedArray()
    var start = 0
    var end = n - 1
    var min = Int.MAX_VALUE
    val result = IntArray(2)
    while (start < end) {
        val sum = abs(ph[start] + ph[end])

        if (sum < min) {
            min = sum
            result[0] = start
            result[1] = end
        }

        if (sum == 0) break

        if (ph[start] + ph[end] > 0) end--
        else start++
    }

    println("${ph[result[0]]} ${ph[result[1]]}")
}
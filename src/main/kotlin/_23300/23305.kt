package _23300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val classes = IntArray(1000001)
    StringTokenizer(readLine()).apply { repeat(n) { classes[nextToken().toInt()]++ } }
    var count = 0
    StringTokenizer(readLine()).apply {
        repeat(n) {
            val classNum = nextToken().toInt()
            if (classes[classNum] > 0) classes[classNum]--
            else count++
        }
    }
    println(count)
}
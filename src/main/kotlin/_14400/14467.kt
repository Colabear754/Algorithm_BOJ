package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cows = IntArray(11) { -1 }
    var count = 0
    repeat(n) {
        StringTokenizer(readLine()).apply {
            val cow = nextToken().toInt()
            val position = nextToken().toInt()
            if (cows[cow] != -1 && cows[cow] != position) {
                count++
            }
            cows[cow] = position
        }
    }
    println(count)
}
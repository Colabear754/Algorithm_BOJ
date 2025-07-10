package _28400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var array = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> {
                    val i = nextToken().toInt() - 1
                    val last = array[i].last()
                    for (j in n - 1 downTo 1) {
                        array[i][j] = array[i][j - 1]
                    }
                    array[i][0] = last
                }
                "2" -> array = Array(n) { r -> IntArray(n) { c -> array[n - 1 - c][r] } }
            }
        }
    }
    println(array.joinToString("\n") { it.joinToString(" ") })
}
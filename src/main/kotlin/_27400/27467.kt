package _27400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var quadratic = 0
    var linear = 0
    var constant = 0
    StringTokenizer(readLine()).apply { repeat(n) {
        when (nextToken().toInt() % 3) {
            2 -> quadratic++
            1 -> linear++
            0 -> constant++
        }
    } }
    println("${linear - quadratic} ${constant - quadratic}")
}
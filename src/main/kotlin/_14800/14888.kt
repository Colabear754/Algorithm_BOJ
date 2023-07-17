package _14800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val operators = StringTokenizer(readLine()).run { IntArray(4) { nextToken().toInt() } }
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    fun dfs(depth: Int, result: Int) {
        if (depth == n) {
            max = maxOf(max, result)
            min = minOf(min, result)
            return
        }
        for (i in 0..3) {
            if (operators[i] > 0) {
                operators[i]--
                when (i) {
                    0 -> dfs(depth + 1, result + numbers[depth])
                    1 -> dfs(depth + 1, result - numbers[depth])
                    2 -> dfs(depth + 1, result * numbers[depth])
                    3 -> dfs(depth + 1, result / numbers[depth])
                }
                operators[i]++
            }
        }
    }
    dfs(1, numbers[0])
    println("$max\n$min")
}
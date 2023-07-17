package _14800

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val visited = BooleanArray(n)
    var min = Int.MAX_VALUE

    fun dfs(current: Int, depth: Int) {
        if (depth == n / 2) {
            var start = 0
            var link = 0
            repeat(n) { i ->
                repeat(n) { j ->
                    when {
                        visited[i] && visited[j] -> start += arr[i][j]
                        !visited[i] && !visited[j] -> link += arr[i][j]
                    }
                }
            }
            min = minOf(min, abs(start - link))
            return
        }

        for (i in current until n) {
            if (!visited[i]) {
                visited[i] = true
                dfs(i + 1, depth + 1)
                visited[i] = false
            }
        }
    }

    dfs(0, 0)
    println(min)
}
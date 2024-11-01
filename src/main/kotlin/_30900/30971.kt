package _30900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val sweets = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val salty = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val notice = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val visited = BooleanArray(n)
    var max = -1
    fun dfs(count: Int, prevSweet: Int, prevNotice: Int, unami: Int) {
        if (count == n) {
            max = maxOf(max, unami)
            return
        }
        for (i in 0..<n) {
            if (visited[i] || prevNotice * notice[i] > k) continue
            visited[i] = true
            dfs(count + 1, sweets[i], notice[i], unami + prevSweet * salty[i])
            visited[i] = false
        }
    }
    repeat(n) {
        visited[it] = true
        dfs(1, sweets[it], notice[it], 0)
        visited[it] = false
    }
    println(max)
}
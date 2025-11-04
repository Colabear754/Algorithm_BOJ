package _25500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val tree = List(n) { mutableListOf<Int>() }
    repeat(n - 1) {
        StringTokenizer(readLine()).apply { tree[nextToken().toInt()].add(nextToken().toInt()) }
    }
    val value = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    fun dfs(start: Int): Long {
        if (tree[start].isEmpty()) return value[start]
        var sum = value[start]
        for (child in tree[start]) {
            dfs(child).let { if (it > 0) sum += it }
        }
        return sum
    }
    println(dfs(0))
}
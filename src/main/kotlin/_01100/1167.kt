package _01100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val v = readLine().toInt()
    val tree = Array(v + 1) { ArrayList<Node>() }
    repeat(v) {
        StringTokenizer(readLine()).apply {
            val from = nextToken().toInt()
            while (hasMoreTokens()) {
                val to = nextToken().toInt()
                if (to == -1) break
                val cost = nextToken().toInt()
                tree[from].add(Node(to, cost))
            }
        }
    }
    val visited = BooleanArray(v + 1)
    var max = 0
    var maxIndex = 0

    fun dfs(index: Int, cost: Int) {
        if (cost > max) {
            max = cost
            maxIndex = index
        }
        visited[index] = true
        tree[index].forEach { if (!visited[it.to]) dfs(it.to, cost + it.cost) }
    }

    dfs(1, 0)
    visited.fill(false)
    dfs(maxIndex, 0)
    println(max)
}

private class Node(val to: Int, val cost: Int)
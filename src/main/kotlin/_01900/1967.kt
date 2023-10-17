package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val tree = Array(n + 1) { ArrayDeque<Node>() }
    val parent = IntArray(n + 1)
    repeat(n - 1) {
        val (a, b, c) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        tree[a].add(Node(b, c))
        tree[b].add(Node(a, c))
    }
    tree.dfs(parent, 1, 0, 0)
    var max = 0
    var index = 0
    for (i in 1..n) {
        if (max < parent[i]) {
            max = parent[i]
            index = i
        }
    }
    parent.fill(0)
    tree.dfs(parent, index, 0, 0)
    println(parent.max())
}

private class Node(val index: Int, val cost: Int)

private fun Array<ArrayDeque<Node>>.dfs(parent: IntArray, current: Int, prev: Int, sum: Int) {
    parent[current] = sum
    for (next in this[current]) {
        if (next.index != prev) {
            dfs(parent, next.index, current, sum + next.cost)
        }
    }
}

package _01700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val nodes = IntArray(n + 1) { it }
    fun findParent(x: Int): Int {
        if (nodes[x] != x) nodes[x] = findParent(nodes[x])
        return nodes[x]
    }
    fun union(a: Int, b: Int) {
        val parentA = findParent(a)
        val parentB = findParent(b)
        if (parentA > parentB) nodes[parentA] = parentB
        else nodes[parentB] = parentA
    }
    repeat(m) {
        StringTokenizer(readLine()).run {
            when (nextToken()) {
                "0" -> union(nextToken().toInt(), nextToken().toInt())
                "1" -> bw.write(if (findParent(nextToken().toInt()) == findParent(nextToken().toInt())) "YES\n" else "NO\n")
            }
        }
    }
    bw.close()
}

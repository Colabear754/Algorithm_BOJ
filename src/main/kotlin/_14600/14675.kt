package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val tree = Array(n + 1) { mutableListOf<Int>() }
    repeat(n - 1) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        tree[a].add(b)
        tree[b].add(a)
    }
    repeat(readLine().toInt()) {
        val (t, k) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        when (t) {
            1 -> bw.write(if (tree[k].size > 1) "yes\n" else "no\n")
            2 -> bw.write("yes\n")
        }
    }
    bw.close()
}
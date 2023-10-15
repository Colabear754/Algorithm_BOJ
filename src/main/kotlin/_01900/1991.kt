package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val tree = Array(n + 1) { CharArray(2) { '.' } }
    repeat(n) {
        val (a, b, c) = StringTokenizer(readLine()).run { Array(3) { nextToken() } }
        tree[a[0] - 'A'][0] = b[0]
        tree[a[0] - 'A'][1] = c[0]
    }
    fun preOrder(x: Char) {
        if (x == '.') return
        sb.append(x)
        preOrder(tree[x - 'A'][0])
        preOrder(tree[x - 'A'][1])
    }
    fun inOrder(x: Char) {
        if (x == '.') return
        inOrder(tree[x - 'A'][0])
        sb.append(x)
        inOrder(tree[x - 'A'][1])
    }
    fun postOrder(x: Char) {
        if (x == '.') return
        postOrder(tree[x - 'A'][0])
        postOrder(tree[x - 'A'][1])
        sb.append(x)
    }
    preOrder('A')
    sb.append('\n')
    inOrder('A')
    sb.append('\n')
    postOrder('A')
    println(sb)
}
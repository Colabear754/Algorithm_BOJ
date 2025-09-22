package _17800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, v) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val headSize = v - 1
    val head = IntArray(headSize) { st.nextToken().toInt() }
    val cycle = n - headSize
    val body = IntArray(cycle) { st.nextToken().toInt() }
    repeat(m) {
        val c = readLine().toInt()
        bw.write(if (c < headSize) "${head[c]}" else "${body[(c - headSize) % cycle]}")
        bw.newLine()
    }
    bw.close()
}
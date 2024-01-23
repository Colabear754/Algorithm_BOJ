package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val friends = IntArray(n + 1)
    repeat(m) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        friends[a]++
        friends[b]++
    }
    repeat(n) { bw.write("${friends[it + 1]}\n") }
    bw.close()
}
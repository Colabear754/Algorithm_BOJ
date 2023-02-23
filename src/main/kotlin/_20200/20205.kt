package _20200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val array = Array(n) { IntArray(n) }
    repeat(n) {
        val st = StringTokenizer(readLine())
        array[it] = IntArray(n) { st.nextToken().toInt() }
    }
    for (i in array.indices) {
        repeat(k) {
            for (j in array[i].indices) {
                repeat(k) { bw.write("${array[i][j]} ") }
            }
            bw.newLine()
        }
    }
    bw.close()
}
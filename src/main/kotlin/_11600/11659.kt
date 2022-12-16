package _11600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(n + 1)
    val sum = IntArray(n + 1)
    val st = StringTokenizer(readLine())
    repeat(n) { i ->
        arr[i + 1] = st.nextToken().toInt().also { n -> sum[i + 1] = sum[i] + n }
    }
    repeat(m) {
        bw.write(StringTokenizer(readLine()).run { "${-sum[nextToken().toInt() - 1] + sum[nextToken().toInt()]}\n" })
    }
    bw.close()
}
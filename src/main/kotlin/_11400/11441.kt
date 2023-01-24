package _11400

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val prefixSum = IntArray(n + 1)
    var st = StringTokenizer(readLine())
    for (i in 1..n) {
        prefixSum[i] = prefixSum[i - 1] + st.nextToken().toInt()
    }
    repeat(readLine().toInt()) {
        st = StringTokenizer(readLine())
        bw.write("${-prefixSum[st.nextToken().toInt() - 1] + prefixSum[st.nextToken().toInt()]}\n")
    }
    bw.close()
}
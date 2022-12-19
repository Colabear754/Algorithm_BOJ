package _16100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = readLine()
    val prefixSum = Array(str.length + 1) { IntArray(26) }
    for (i in 1..str.length) {
        for (j in 0..25) prefixSum[i][j] = prefixSum[i - 1][j]
        prefixSum[i][str[i - 1] - 'a']++
    }
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        st.nextToken().also { c ->
            bw.write("${-prefixSum[st.nextToken().toInt()][c[0] - 'a'] + prefixSum[st.nextToken().toInt() + 1][c[0] - 'a']}\n")
        }
    }
    bw.close()
}
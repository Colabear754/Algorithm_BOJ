package _10200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val n = st.nextToken().toInt()
        val (a, b) = LongArray(2) { st.nextToken().toLong() }
        val binaryA = a.toString(2).padStart(n + 1, '0')
        val binaryB = b.toString(2).padStart(n + 1, '0')
        bw.appendLine("${maxOf(binaryA.lastIndexOf("1"), binaryB.lastIndexOf("1"))}")
    }
    bw.close()
}
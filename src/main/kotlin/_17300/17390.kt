package _17300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }.sortedArray()
    val prefixSum = IntArray(n + 1)
    for (i in 1..n) {
        prefixSum[i] = prefixSum[i - 1] + arr[i - 1]
    }
    var l: Int
    var r: Int
    repeat(q) {
        StringTokenizer(readLine()).apply {
            l = nextToken().toInt()
            r = nextToken().toInt()
        }
        bw.write("${prefixSum[r] - prefixSum[l - 1]}\n")
    }
    bw.close()
}
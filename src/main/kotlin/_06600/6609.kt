package _06600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    while (!readLine().also { input = it }.isNullOrEmpty()) {
        val arr = StringTokenizer(input).run { IntArray(7) { nextToken().toInt() } }
        repeat(arr[6]) {
            val temp = arr[0]
            arr[0] = arr[1] / arr[5]
            arr[1] = arr[2] / arr[4]
            arr[2] = temp * arr[3]
        }
        bw.write("${arr[0]}\n")
    }
    bw.close()
}
package _02900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val arr = StringTokenizer(readLine()).run { IntArray(5) { nextToken().toInt() } }
    val sorted = IntArray(5) { it + 1 }
    while (!arr.contentEquals(sorted)) {
        for (i in 0..<4) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1].also { arr[i + 1] = arr[i] }
                bw.write("${arr.joinToString(" ")}\n")
            }
        }
    }
    bw.close()
}
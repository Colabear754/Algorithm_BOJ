package _24500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var index = 0
    for (i in 1..<n) {
        if (arr[index] != arr[i]) {
            bw.write("${i + 1} ".repeat(i - index))
            index = i
        }
    }
    bw.write("-1 ".repeat(n - index))
    bw.close()
}
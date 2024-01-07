package _05800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val n = nextToken().toInt()
            val arr = IntArray(n) { nextToken().toInt() }.sortedArrayDescending()
            var maxGap = 0
            for (i in 0..<n - 1) {
                maxGap = maxOf(maxGap, arr[i] - arr[i + 1])
            }
            bw.write("Class ${it + 1}\n")
            bw.write("Max ${arr[0]}, Min ${arr.last()}, Largest gap $maxGap\n")
        }
    }
    bw.close()
}
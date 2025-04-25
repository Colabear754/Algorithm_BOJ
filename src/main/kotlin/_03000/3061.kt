package _03000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val ladder = IntArray(1) + StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        var count = 0
        var index = 1
        for (i in 1..n) {
            for (j in 1..n) {
                if (i == ladder[j]) {
                    index = j
                    break
                }
            }
            while (i != ladder[i]) {
                ladder[index] = ladder[index - 1].also { ladder[index - 1] = ladder[index] }
                count++
                index--
            }
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
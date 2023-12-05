package _20000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        var (min, max) = array[0] to array[0]
        for (i in 1..<n) {
            min = minOf(min, array[i])
            max = maxOf(max, array[i])
        }
        bw.write("$min $max\n")
    }
    bw.close()
}
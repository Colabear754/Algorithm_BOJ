package _07700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, m) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        val b = StringTokenizer(readLine()).run { IntArray(m) { nextToken().toInt() } }.apply { sort() }
        var count = 0
        for (i in a) {
            var left = 0
            var right = m - 1
            while (left <= right) {
                val mid = (left + right) / 2
                if (b[mid] < i) left = mid + 1
                else right = mid - 1
            }
            count += left
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
package _13400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val dots = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.apply { sort() }
        var result = 0
        for (mid in 0..<n) {
            for (left in 0..<mid) {
                if (dots.binarySearch(2 * dots[mid] - dots[left]) > mid) result++
            }
        }
        bw.appendLine("$result")
    }
    bw.close()
}
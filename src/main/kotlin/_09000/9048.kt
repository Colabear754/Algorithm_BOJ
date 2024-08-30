package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (f, r, n) = readLine().split(' ').map { it.toInt() }
        val offices = Array(f) { arrayListOf(0, r + 1) }
        repeat(n) {
            StringTokenizer(readLine()).apply { offices[nextToken().toInt() - 1].add(nextToken().toInt()) }
        }
        var result = 2 * f + r + 1
        for (floor in offices) {
            if (floor.size == 2) continue
            floor.sort()
            var min = Int.MAX_VALUE
            for (i in 0..<floor.lastIndex) {
                min = minOf(min, floor[i] + r + 1 - floor[i + 1])
            }
            result += min * 2
        }
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}
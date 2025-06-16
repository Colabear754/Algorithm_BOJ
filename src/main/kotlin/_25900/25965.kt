package _25900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val missions = Array(readLine().toInt()) { StringTokenizer(readLine()).run { LongArray(3) { nextToken().toLong() } } }
        val (k, d, a) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        var donation = 0L
        missions.forEach { (it[0] * k - it[1] * d + it[2] * a).let { amount -> if (amount > 0) donation += amount} }
        bw.write("$donation")
        bw.newLine()
    }
    bw.close()
}
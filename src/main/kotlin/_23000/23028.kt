package _23000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var (n, a, b) = readLine().split(' ').map { it.toInt() }
    val classes = Array(10) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
    repeat(8 - n) {
        val major = classes[it][0]
        val notMajor = minOf(6 - major, classes[it][1])
        a += 3 * major
        b += 3 * major
        b += 3 * notMajor
        if (a >= 66 && b >= 130) {
            println("Nice")
            return@with
        }
    }
    println("Nae ga wae")
}
package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val achievements = StringTokenizer(readLine()).run { IntArray(k) { nextToken().toInt() } }
    for (achievement in achievements) {
        when (achievement * 100 / n) {
            in 0..4 -> sb.append("1 ")
            in 5..11 -> sb.append("2 ")
            in 12..23 -> sb.append("3 ")
            in 24..40 -> sb.append("4 ")
            in 41..60 -> sb.append("5 ")
            in 61..77 -> sb.append("6 ")
            in 78..89 -> sb.append("7 ")
            in 90..96 -> sb.append("8 ")
            else -> sb.append("9 ")
        }
    }
    println(sb)
}
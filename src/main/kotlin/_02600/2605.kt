package _02600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val waitingLine = ArrayDeque<Int>()
    val losers = ArrayDeque<Int>()
    StringTokenizer(readLine()).run { repeat(n) {
        repeat(nextToken().toInt()) { losers.addLast(waitingLine.removeLast()) }
        waitingLine.addLast(it + 1)
        while (losers.isNotEmpty()) waitingLine.addLast(losers.removeLast())
    } }
    println(waitingLine.joinToString(" "))
}
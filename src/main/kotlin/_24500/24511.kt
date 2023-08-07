package _24500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val queuestack = ArrayDeque<Int>().apply { StringTokenizer(readLine()).apply { repeat(n) { nextToken().apply { if (a[it] == 0) addLast(this.toInt()) } } } }
    readLine()
    StringTokenizer(readLine()).apply {
        while (hasMoreTokens()) {
            queuestack.addFirst(nextToken().toInt())
            sb.append(queuestack.removeLast()).append(' ')
        }
    }
    println(sb)
}
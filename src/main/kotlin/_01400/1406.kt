package _01400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val deque = ArrayDeque<Char>()
    val sb = StringBuilder(readLine())
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "L" -> if (sb.isNotEmpty()) deque.addLast(sb[sb.lastIndex].apply { sb.deleteAt(sb.lastIndex) })
                "D" -> if (deque.isNotEmpty()) sb.append(deque.removeLast())
                "B" -> if (sb.isNotEmpty()) sb.deleteAt(sb.lastIndex)
                "P" -> sb.append(nextToken())
            }
        }
    }
    println("$sb${deque.reversed().joinToString("")}")
}
package _27400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val deque = ArrayDeque<Char>()
    val recentCommand = ArrayDeque<Char>()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run {
            when (val command = nextToken()[0]) {
                '1' -> deque.addLast(nextToken()[0]).also { recentCommand.addLast(command) }
                '2' -> deque.addFirst(nextToken()[0]).also { recentCommand.addLast(command) }
                '3' -> when (recentCommand.removeLastOrNull()) {
                    '1' -> deque.removeLast()
                    '2' -> deque.removeFirst()
                }
            }
        }
    }
    println(if (deque.isEmpty()) 0 else deque.joinToString(""))
}
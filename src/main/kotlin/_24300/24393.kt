package _24300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val deck = ArrayDeque<Int>().apply { addAll(1..27) }
    val left = ArrayDeque<Int>()
    val right = ArrayDeque<Int>()
    repeat(n) {
        repeat(13) { left.addLast(deck.removeFirst()) }
        repeat(14) { right.addLast(deck.removeFirst()) }
        StringTokenizer(readLine()).apply {
            repeat (countTokens()) { i ->
                val card = nextToken().toInt()
                if (i and 1 == 0) repeat(card) { deck.addLast(right.removeFirst()) }
                else repeat(card) { deck.addLast(left.removeFirst()) }
            }
        }
    }
    println(deck.indexOf(1) + 1)
}
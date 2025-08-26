package _28400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cards = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val stack = ArrayDeque<Int>().apply { add(Int.MAX_VALUE) }
    var result = 0L
    for (card in cards) {
        while (stack.last() <= card) {
            val mid = stack.removeLast()
            val bigger = stack.last()
            result += mid + minOf(bigger, card)
        }
        stack.addLast(card)
    }
    while (stack.size > 2) result += stack.removeLast() + stack.last()
    println(result)
}
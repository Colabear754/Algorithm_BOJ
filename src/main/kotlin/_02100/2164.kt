package _02100

import java.util.LinkedList
import java.util.Queue

fun main() = with(System.`in`.bufferedReader()) {
    val card: Queue<Int> = LinkedList()
    repeat(readLine().toInt()) {
        card.add(it + 1)
    }
    while (card.size > 1) {
        card.poll()
        card.add(card.poll())
    }
    println(card.poll())
}
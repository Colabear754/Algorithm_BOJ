package _01700

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val cards = PriorityQueue<Int>()
    repeat(readLine().toInt()) {
        cards.add(readLine().toInt())
    }
    var sum = 0
    while (cards.size > 1) {
        val newCard = cards.poll() + cards.poll()
        sum += newCard
        cards.add(newCard)
    }
    println(sum)
}
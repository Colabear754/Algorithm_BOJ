package _27100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val card = HashMap<String, Int>()
    repeat(readLine().toInt()) { StringTokenizer(readLine()).apply { nextToken().also { card[it] = (card[it] ?: 0) + nextToken().toInt() } } }
    println(if (card.filter { it.value == 5 }.isNotEmpty()) "YES" else "NO")
}
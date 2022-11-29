package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val cards = IntArray(n) { st.nextToken().toInt() }
    var max = 0
    for (i in 0..cards.lastIndex - 2) {
        for (j in i + 1 until cards.lastIndex) {
            for (k in j + 1..cards.lastIndex) {
                if (cards[i] + cards[j] + cards[k] <= m) {
                    max = maxOf(max, cards[i] + cards[j] + cards[k])
                }
            }
        }
    }
    println(max)
}
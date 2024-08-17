package _16700

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val entries = LinkedList<Pair<Int, Int>>()
    StringTokenizer(readLine()).apply { repeat(n) { entries.add(it to nextToken().toInt()) } }
    val leavingOutRank = StringTokenizer(readLine()).run { IntArray(n - m + 1) { nextToken().toInt() } }
    val players = LinkedList<Pair<Int, Int>>()
    repeat(m) { players.add(entries.removeFirst()) }
    repeat(n - m + 1) { i ->
        players.sortWith(compareBy({ it.second }, { it.first }))
        players.removeAt(leavingOutRank[i] - 1)
        if (entries.isNotEmpty()) players.add(entries.removeFirst())
    }
    println(players.joinToString(" ") { "${it.second}" })
}
package _01400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, d) = readLine().split(' ').map { it.toInt() }
    val shortcutMap = HashMap<Int, MutableList<Pair<Int, Int>>>()
    repeat(n) {
        val (start, end, distance) = StringTokenizer(readLine()).run { IntArray(3) { nextToken().toInt() } }
        if (end > d) return@repeat
        if (end - start <= distance) return@repeat
        shortcutMap[start] = (shortcutMap[start] ?: mutableListOf()).apply { add(end to distance) }
    }
    val distance = IntArray(d + 1) { it }.apply { calcDistance(shortcutMap[0] ?: emptyList(), 0) }
    for (i in 1..d) {
        distance[i] = minOf(distance[i], distance[i - 1] + 1)
        distance.calcDistance(shortcutMap[i] ?: emptyList(), i)
    }
    println(distance[d])
}

private fun IntArray.calcDistance(shortcuts: List<Pair<Int, Int>>, d: Int) {
    for (shortcut in shortcuts) {
        val (end, dist) = shortcut
        this[end] = minOf(this[end], this[d] + dist)
    }
}
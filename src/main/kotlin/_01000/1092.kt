package _01000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val crains = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sortedArrayDescending() }
    val m = readLine().toInt()
    val boxes = StringTokenizer(readLine()).run {
        val pq = ArrayList<Int>()
        repeat(m) { pq.add(nextToken().toInt()) }
        pq.sortDescending()
        pq
    }

    if (crains[0] < boxes[0]) {
        println(-1)
        return@with
    }

    var minutes = 0
    while (boxes.isNotEmpty()) {
        var boxIndex = 0
        var crainIndex = 0
        while (crainIndex < crains.size) {
            if (boxIndex == boxes.size) break
            if (crains[crainIndex] >= boxes[boxIndex]) {
                boxes.removeAt(boxIndex)
                crainIndex++
            } else {
                boxIndex++
            }
        }
        minutes++
    }

    println(minutes)
}
package _30800

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = LinkedList<Int>()
    StringTokenizer(readLine()).run { repeat(n) { a.add(nextToken().toInt()) } }
    val m = readLine().toInt()
    val b = LinkedList<Int>()
    StringTokenizer(readLine()).run { repeat(m) { b.add(nextToken().toInt()) } }
    val commonSubsequence = ArrayList<Int>()
    var maxA: Int
    var maxB: Int
    while (a.isNotEmpty() && b.isNotEmpty()) {
        maxA = a.max()
        maxB = b.max()
        when {
            maxA == maxB -> {
                commonSubsequence.add(maxA)
                a.subList(0, a.indexOf(maxA) + 1).clear()
                b.subList(0, b.indexOf(maxB) + 1).clear()
            }
            maxA > maxB -> a.remove(maxA)
            else -> b.remove(maxB)
        }
    }
    println("${commonSubsequence.size}\n${if (commonSubsequence.isEmpty()) "" else commonSubsequence.joinToString(" ")}")
}
package _14200

import java.util.StringTokenizer
import kotlin.math.sign

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val heights = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val growth = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    val trees = Array(n) { Tree(heights[it], growth[it]) }.apply { sort() }
    var result = 0L
    for (i in 0..<n) {
        result += trees[i].height + i * trees[i].growth
    }
    println(result)
}

private class Tree(val height: Long, val growth: Long) : Comparable<Tree> {
    override fun compareTo(other: Tree) = (this.growth - other.growth).sign
}
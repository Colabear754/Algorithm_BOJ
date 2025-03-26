package _13100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val parents = Array<Pair<Int, Int>?>(n + 1) { null }
    repeat(n) {
        val input = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toInt() }
        if (input.first != 0 && input.second != 0) parents[it + 1] = input
    }
    val m = readLine().toInt()
    val isDead = BooleanArray(n + 1)
    if (m != 0) StringTokenizer(readLine()).run { repeat(m) { isDead[nextToken().toInt()] = true } }
    var count = 0
    for (i in 1..n) {
        if (isDead[i]) continue
        val (mother, father) = parents[i] ?: continue
        if (!isDead[mother] && !isDead[father]) count++
    }
    println(count)
}
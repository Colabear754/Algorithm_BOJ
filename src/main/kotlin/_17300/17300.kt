package _17300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val l = readLine().toInt()
    val pattern = StringTokenizer(readLine()).run { IntArray(l) { nextToken().toInt() } }
    if (pattern.toSet().size != l) {
        println("NO")
        return@with
    }
    val visited = BooleanArray(10)
    visited[0] = true
    val mid = Array(10) { IntArray(10) }
    mid[1][3] = 2.also { mid[3][1] = it }
    mid[1][7] = 4.also { mid[7][1] = it }
    mid[1][9] = 5.also { mid[9][1] = it }.also { mid[2][8] = it }.also { mid[8][2] = it }.also { mid[3][7] = it }.also { mid[7][3] = it }.also { mid[4][6] = it }.also { mid[6][4] = it }
    mid[3][9] = 6.also { mid[9][3] = it }
    mid[7][9] = 8.also { mid[9][7] = it }
    var prev = pattern[0]
    visited[prev] = true
    for (i in 1..<l) {
        if (!visited[mid[prev][pattern[i]]]) {
            println("NO")
            return@with
        }
        visited[pattern[i]] = true
        prev = pattern[i]
    }
    println("YES")
}
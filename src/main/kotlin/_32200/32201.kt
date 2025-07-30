package _32200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val risenRank = mutableMapOf<Int, Int>()
    StringTokenizer(readLine()).apply {
        for (i in 0..<n) risenRank[nextToken().toInt()] = i
    }
    var max = Int.MIN_VALUE
    val finalRank = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt()} }
    finalRank.forEachIndexed { i, b ->
        risenRank[b] = (risenRank[b]!! - i).also { max = maxOf(max, it) }
    }
    for (player in finalRank) {
        if (risenRank[player] == max) bw.write("$player ")
    }
    bw.close()
}
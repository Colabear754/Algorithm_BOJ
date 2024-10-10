package _28000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val towers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var prev = towers[0]
    var count = 1
    for (i in 1..<n) {
        if (prev <= towers[i]) count++
        prev = towers[i]
    }
    println(count)
}
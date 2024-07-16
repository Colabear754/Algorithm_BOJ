package _02300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val files = List(n) { StringTokenizer(readLine()).run { IntArray(countTokens() - 1) { nextToken().toInt() } } }
    var k = 1
    loop@ while (true) {
        val seenPrefixes = mutableSetOf<List<Int>>()
        for (file in files) {
            val prefix = file.take(k).toMutableList()
            while (prefix.size < k) {
                prefix.add(0)
            }
            if (!seenPrefixes.add(prefix)) {
                k++
                continue@loop
            }
        }
        break
    }
    println(k)
}
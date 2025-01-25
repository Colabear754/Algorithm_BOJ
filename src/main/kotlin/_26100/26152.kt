package _26100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val hurdles = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    StringTokenizer(readLine()).run { repeat(n) { hurdles[it] -= nextToken().toInt() } }
    val q = readLine().toInt()
    val birds = StringTokenizer(readLine()).run { List(q) { it to nextToken().toInt() } }.sortedBy { -it.second }
    var count = 0
    val results = IntArray(q)
    for (bird in birds) {
        while (count < n && bird.second <= hurdles[count]) count++
        results[bird.first] = count
    }
    println(results.joinToString("\n"))
}
package _01300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val steppingStones = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() - 1 } }
    if (a == b) return@with println(0)
    if (steppingStones[a] == 1) return@with println(1)
    val jumpCount = IntArray(n) { -1 }.apply { this[a] = 0 }
    val queue = ArrayDeque<Int>().apply { add(a) }
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        if (current == b) return@with println(jumpCount[b])
        for (i in current % steppingStones[current]..<n step steppingStones[current]) {
            if (jumpCount[i] == -1) {
                jumpCount[i] = jumpCount[current] + 1
                queue.add(i)
            }
        }
    }
    println(-1)
}
package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val p = readLine().toDouble() / 100.0
    val n = readLine().toInt()
    val steppingStones = IntArray(100)
    repeat(n) {
        StringTokenizer(readLine()).apply {
            val position = nextToken().toInt()
            when (nextToken()) {
                "L" -> for (i in 0..<position - 1) steppingStones[i] = (steppingStones[i] + 1) % 3
                "R" -> for (i in position..99) steppingStones[i] = (steppingStones[i] + 1) % 3
            }
        }
    }
    var b = 0.0
    var r = 0.0
    var g = 0.0
    for (stone in steppingStones) {
        when (stone) {
            0 -> b += p
            1 -> r += p
            2 -> g += p
        }
    }
    println("%.2f\n%.2f\n%.2f".format(b, r, g))
}
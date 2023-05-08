package _15700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, b) = readLine().split(' ').map { it.toInt() }
    val attractiveness = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
    val jinseo = attractiveness[a - 1][b - 1]
    for (i in 0 until n) {
        if (jinseo < attractiveness[i][b - 1]) {
            println("ANGRY")
            return@with
        }
    }
    println(if (attractiveness[a - 1].count { it > jinseo } > 1) "ANGRY" else "HAPPY")
}
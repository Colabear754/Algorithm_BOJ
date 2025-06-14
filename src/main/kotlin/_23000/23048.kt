package _23000

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val colors = IntArray(n + 1)
    colors[1] = 1
    var k = 1
    val sqrt = sqrt(n.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (colors[i] == 0) {
            colors[i] = ++k
            for (j in i * i..n step i) {
                colors[j] = k
            }
        }
    }
    for (i in sqrt + 1..n) {
        if (colors[i] == 0) colors[i] = ++k
    }
    bw.write("$k\n")
    for (i in 1..n) {
        bw.write("${colors[i]} ")
    }
    bw.close()
}
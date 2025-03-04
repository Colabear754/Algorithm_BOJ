package _17600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val coordinates = Array(n) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() + 500000 } } }
    val countX = IntArray(1000001)
    val countY = IntArray(1000001)
    repeat(n) {
        val (x, y) = coordinates[it]
        val (nx, ny) = coordinates[(it + 1) % n]
        if (x == nx) {
            countY[maxOf(y, ny)]--
            countY[minOf(y, ny)]++
            return@repeat
        }
        countX[maxOf(x, nx)]--
        countX[minOf(x, nx)]++
    }
    for (i in 1..1000000) {
        countX[i] += countX[i - 1]
        countY[i] += countY[i - 1]
    }
    println(maxOf(countX.max(), countY.max()))
}
package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var (n, b) = readLine().split(' ').map { it.toLong() }
    var matrix = Array(n.toInt()) { StringTokenizer(readLine()).run { LongArray(n.toInt()) { nextToken().toLong() } } }
    var unit = Array(n.toInt()) { LongArray(n.toInt()) }
    for (i in unit.indices) unit[i][i] = 1
    while (b > 0) {
        if (b % 2 == 1L) {
            unit *= matrix
        }
        matrix *= matrix
        b /= 2
    }
    println(unit.joinToString("\n") { it.joinToString(" ") })
}

private operator fun Array<LongArray>.times(matrix: Array<LongArray>): Array<LongArray> {
    val result = Array(size) { LongArray(matrix[0].size) }
    for (i in indices) {
        for (j in matrix[0].indices) {
            for (k in matrix.indices) {
                result[i][j] += this[i][k] * matrix[k][j]
            }
            result[i][j] = result[i][j] % 1000
        }
    }
    return result
}
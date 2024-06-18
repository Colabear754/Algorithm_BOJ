package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val matrixes = ArrayList<Array<LongArray>>()
    StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.also { (x, y) ->
        matrixes.add(Array(x) { StringTokenizer(readLine()).run { LongArray(y) { nextToken().toLong() } } })
    }
    repeat(n - 1) {
        StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }.also { (x, y) ->
            if (matrixes.last()[0].size != x) {
                println(-1)
                return@with
            }
            matrixes.add(Array(x) { StringTokenizer(readLine()).run { LongArray(y) { nextToken().toLong() } } })
        }
    }
    println(matrixes.reduce { acc, array -> acc.multiply(array) }.sumOf { it.sum() % 1000000007 } % 1000000007)
}

private fun Array<LongArray>.multiply(other: Array<LongArray>): Array<LongArray> {
    val result = Array(size) { LongArray(other[0].size) }
    for (i in indices) {
        for (j in other[0].indices) {
            for (k in other.indices) {
                result[i][j] += this[i][k] * other[k][j]
                result[i][j] = result[i][j] % 1000000007
            }
        }
    }
    return result
}
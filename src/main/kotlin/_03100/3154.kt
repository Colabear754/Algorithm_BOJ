package _03100

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val coordinates = arrayOf(
        intArrayOf(3, 1),
        intArrayOf(0, 0),
        intArrayOf(0, 1),
        intArrayOf(0, 2),
        intArrayOf(1, 0),
        intArrayOf(1, 1),
        intArrayOf(1, 2),
        intArrayOf(2, 0),
        intArrayOf(2, 1),
        intArrayOf(2, 2)
    )
    val (h, m) = readLine()!!.split(':').map { it.toInt() }
    var min = Int.MAX_VALUE
    var targetH = 0
    var targetM = 0
    for (i in 0..99) {
        for (j in 0..99) {
            if (i % 24 != h || j % 60 != m) continue
            val effort = (coordinates[i / 10] - coordinates[i % 10]) +
                    (coordinates[i % 10] - coordinates[j / 10]) +
                    (coordinates[j / 10] - coordinates[j % 10])
            if (effort < min) {
                min = effort
                targetH = i
                targetM = j
            }
        }
    }
    println("%02d:%02d".format(targetH, targetM))
}

private operator fun IntArray.minus(other: IntArray): Int {
    return abs(this[0] - other[0]) + abs(this[1] - other[1])
}
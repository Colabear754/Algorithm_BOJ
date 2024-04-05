package _18200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val lectureRoom = Array(n) { IntArray(n) }
    val professor = IntArray(2)
    val sungyu = IntArray(2)
    repeat(n) { i ->
        StringTokenizer(readLine()).apply {
            repeat(n) { j ->
                lectureRoom[i][j] = nextToken().toInt()
                when (lectureRoom[i][j]) {
                    5 -> {
                        professor[0] = i
                        professor[1] = j
                    }
                    2 -> {
                        sungyu[0] = i
                        sungyu[1] = j
                    }
                }
            }
        }
    }
    if ((professor[0] - sungyu[0]).pow() + (professor[1] - sungyu[1]).pow() < 25) {
        println(0)
        return@with
    }
    val top = minOf(professor[0], sungyu[0])
    val bottom = maxOf(professor[0], sungyu[0])
    val left = minOf(professor[1], sungyu[1])
    val right = maxOf(professor[1], sungyu[1])
    var count = 0
    for (i in top..bottom) {
        for (j in left..right) {
            if (lectureRoom[i][j] == 1) {
                count++
            }
            if (count >= 3) {
                println(1)
                return@with
            }
        }
    }
    println(0)
}

private fun Int.pow() = this * this
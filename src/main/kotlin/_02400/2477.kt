package _02400

import java.util.*
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    var width = 0
    var widthIndex = 0
    var height = 0
    var heightIndex = 0
    val farm = Array(6) { IntArray(2) }
    repeat(6) { i ->
        StringTokenizer(readLine()).apply {
            farm[i][0] = nextToken().toInt()
            when (farm[i][0]) {
                1, 2 -> {
                    nextToken().toInt().also {
                        farm[i][1] = it
                        if (width < it) {
                            width = maxOf(width, it)
                            widthIndex = i
                        }
                    }
                }
                3, 4 -> {
                    nextToken().toInt().also {
                        farm[i][1] = it
                        if (height < it) {
                            height = maxOf(height, it)
                            heightIndex = i
                        }
                    }
                }
            }
        }
    }
    val subWidth = abs(farm[(widthIndex - 1).takeIf { it != -1 } ?: 5][1] - farm[(widthIndex + 1) % 6][1])
    val subHeight = abs(farm[(heightIndex - 1).takeIf { it != -1 } ?: 5][1] - farm[(heightIndex + 1) % 6][1])
    println((width * height - subWidth * subHeight) * k)
}
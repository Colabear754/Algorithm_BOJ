package _20900

import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val monitors = Array(readLine().toInt()) { it + 1 to StringTokenizer(readLine()).run {
        sqrt(nextToken().toDouble().run { pow(2) } + nextToken().toDouble().run { pow(2) }) / 77
    } }
    monitors.sortWith(compareBy({ -it.second }, { it.first }))
    println(monitors.joinToString("\n") { "${it.first}" })
}
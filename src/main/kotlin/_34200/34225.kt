package _34200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val modules = StringTokenizer(readLine()).run { Array(n) { Module(it + 1, nextToken().toLong()) } }.apply { sortBy { it.efficiency } }
    var sum = modules.sumOf { it.efficiency }
    var max = 0L
    var start = 0
    for (i in modules.indices) {
        val current = modules[i].efficiency + modules.last().efficiency + sum
        if (current > max) {
            max = current
            start = i
        }
        sum -= modules[i].efficiency
    }
    sb.append(n - start).append('\n')
    for (i in start..<n) sb.append(modules[i].id).append(' ')
    println(sb)
}

private class Module(val id: Int, val efficiency: Long)
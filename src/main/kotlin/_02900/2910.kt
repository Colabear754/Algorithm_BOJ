package _02900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    readLine()
    val map = HashMap<Int, Num>()
    StringTokenizer(readLine()).apply {
        repeat(countTokens()) {
            val num = nextToken().toInt()
            map[num] = map[num]?.apply { count++ } ?: Num(num, 1, it)
        }
    }
    map.values.sorted().forEach { num ->
        repeat(num.count) { sb.append("${num.value} ") }
    }
    println(sb)
}

private class Num(val value: Int, var count: Int, val index: Int) : Comparable<Num> {
    override fun compareTo(other: Num) = if (count == other.count) index - other.index else other.count - count
}
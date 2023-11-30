package _01400

fun main() = with(System.`in`.bufferedReader()) {
    Array(readLine().toInt()) { readLine() }
        .sortedArrayWith(compareBy({ it.length }, { it.sumOf { c -> if (c.isDigit()) c - '0' else 0 } }, { it }))
        .run { println(joinToString("\n")) }
}
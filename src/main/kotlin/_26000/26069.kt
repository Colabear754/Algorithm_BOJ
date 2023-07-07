package _26000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val dancing = HashSet<String>().apply { add("ChongChong") }
    repeat(readLine().toInt()) {
        val input = StringTokenizer(readLine()).run { Array(2) { nextToken() } }
        if (input[0] in dancing || input[1] in dancing) dancing.add(input[0]).also { dancing.add(input[1]) }
    }
    println(dancing.size)
}
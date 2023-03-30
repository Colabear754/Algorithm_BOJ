package _16400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = StringTokenizer(readLine()).run { Array(n) { nextToken() }.sortedArrayWith { o1, o2 -> (o2 + o1).compareTo(o1 + o2) } }
    println(numbers.takeUnless { it.count { c -> c == "0" } == it.size }?.joinToString("") ?: 0)
}
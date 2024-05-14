package _28100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val way1 = IntArray(3)
    val way2 = Array(3) { 0 to "" }
    repeat(3) {
        StringTokenizer(readLine()).apply {
            val (p, y) = IntArray(2) { nextToken().toInt() }
            val name = nextToken()
            way1[it] = y
            way2[it] = p to name
        }
    }
    way1.sort()
    way2.sortByDescending { it.first }
    println("${way1.joinToString("") { "${it % 100}" }}\n${way2.joinToString("") { "${it.second[0]}" }}")
}
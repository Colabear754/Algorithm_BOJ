package _01200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = HashMap<Int, Int>()
    StringTokenizer(readLine()).apply {
        repeat(n) { nextToken().toInt().let { map[it] = map[it]?.plus(1) ?: 1 } }
    }
    StringTokenizer(readLine()).apply {
        repeat(m) { nextToken().toInt().let { map[it] = map[it]?.plus(1) ?: 1 } }
    }
    println(map.count { it.value == 1 })
}
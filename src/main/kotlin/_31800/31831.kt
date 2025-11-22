package _31800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var stress = 0
    var result = 0
    StringTokenizer(readLine()).apply {
        repeat(n) {
            stress = maxOf(0, stress + nextToken().toInt())
            if (stress >= m) result++
        }
    }
    println(result)
}
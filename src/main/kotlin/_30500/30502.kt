package _30500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val photosynthesis = IntArray(n + 1) { -1 }
    val mobility = IntArray(n + 1) { -1 }
    repeat(m) {
        StringTokenizer(readLine()).run {
            val number = nextToken().toInt()
            when (nextToken()) {
                "P" -> photosynthesis[number] = nextToken().toInt()
                "M" -> mobility[number] = nextToken().toInt()
            }
        }
    }
    println("${(1..n).count { photosynthesis[it] == 1 && mobility[it] == 0 }} ${(1..n).count { photosynthesis[it] != 0 && mobility[it] != 1 }}")
}
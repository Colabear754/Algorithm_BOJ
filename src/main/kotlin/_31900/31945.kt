package _31900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val able = arrayOf(
        setOf(0, 1, 2, 3),
        setOf(4, 5, 6, 7),
        setOf(0, 2, 4, 6),
        setOf(1, 3, 5, 7),
        setOf(0, 1, 4, 5),
        setOf(2, 3, 6, 7)
    )
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val points = mutableSetOf<Int>().apply { repeat(4) { add(nextToken().toInt()) } }
            bw.write(if (points in able) "YES\n" else "NO\n")
        }
    }
    bw.close()
}
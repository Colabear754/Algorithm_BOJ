package _18100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val photo = Array(r + 1) { CharArray(c + 1) }
    for (i in 0 until c) {
        StringTokenizer(readLine()).apply {
            for (j in 1..r) photo[j][c - i] = nextToken()[0]
        }
    }
    val feedstuff = arrayOf(CharArray(c + 1)) + Array(r) { StringTokenizer(readLine()).run { CharArray(1) + CharArray(c) { nextToken()[0] } } }
    println(if (photo.contentDeepEquals(feedstuff)) """
        |>___/|        /}
        | O < |       / }
        (==0==)------/ }
        | ^  _____    |
        |_|_/     ||__|
    """.trimIndent() else """
        |>___/|     /}
        | O O |    / }
        ( =0= )""${'"'}${'"'}  \
        | ^  ____    |
        |_|_/    ||__|
    """.trimIndent())
}
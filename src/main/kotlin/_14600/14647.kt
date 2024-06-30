package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val countRow = IntArray(n)
    val countColumn = IntArray(m)
    var count = 0
    repeat(n) { i ->
        StringTokenizer(readLine()).apply {
            repeat(m) { j ->
                val nine = nextToken().count { it == '9' }
                countRow[i] += nine
                countColumn[j] += nine
                count += nine
            }
        }
    }
    println(count - maxOf(countRow.max(), countColumn.max()))
}
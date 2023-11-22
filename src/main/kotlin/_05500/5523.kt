package _05500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val win = IntArray(2)
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply { IntArray(2) { nextToken().toInt() }.also { (a, b) -> if (a > b) win[0]++ else if (a < b) win[1]++ } }
    }
    println(win.joinToString(" "))
}
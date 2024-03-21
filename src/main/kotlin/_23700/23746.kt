package _23700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val encodingMap = HashMap<Char, String>()
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { Array(2) { nextToken() } }
        encodingMap[b[0]] = a
    }
    val sb = StringBuilder()
    for (c in readLine()) {
        sb.append(encodingMap[c] ?: c)
    }
    val (s, e) = readLine().split(' ').map { it.toInt() }
    println(sb.slice(s - 1..<e))
}
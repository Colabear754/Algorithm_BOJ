package _14400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val s = HashSet<String>()
    var cnt = 0
    StringTokenizer(readLine()).run {
        repeat(nextToken().toInt()) {
            s.add(readLine())
        }
        repeat(nextToken().toInt()) {
            if (s.contains(readLine())) cnt++
        }
    }
    println(cnt)
}
package _07700

import java.util.StringTokenizer
import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val entered = TreeSet<String>(reverseOrder())
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val name = nextToken()
            when (nextToken()) {
                "enter" -> entered.add(name)
                else -> entered.remove(name)
            }
        }
    }
    println(entered.joinToString("\n"))
}
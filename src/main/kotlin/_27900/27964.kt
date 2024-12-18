package _27900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    val cheeseSet = mutableSetOf<String>()
    StringTokenizer(readLine()).run { repeat (countTokens()) { nextToken().also { if (it.endsWith("Cheese")) cheeseSet.add(it) } } }
    println(if (cheeseSet.size >= 4) "yummy" else "sad")
}
package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val sb = StringBuilder()
    repeat(n.toInt()) { sb.append(it + 1) }
    println(sb.indexOf(n) + 1)
}
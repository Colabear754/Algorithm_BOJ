package _23000

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    val ribbon = readLine()
    for (i in ribbon.indices step n) sb.append(ribbon[i])
    println(sb)
}
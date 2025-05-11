package _27700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var positive = 0
    var abstention = 0
    java.util.StringTokenizer(readLine()).run { repeat(n) { nextToken().toInt().let { if (it == 0) abstention++ else positive += it } } }
    println(when {
        abstention * 2 >= n -> "INVALID"
        positive > 0 -> "APPROVED"
        else -> "REJECTED"
    })
}
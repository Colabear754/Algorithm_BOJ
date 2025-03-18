package _05000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, b) = readLine().split(' ').map { it.toLong() }
    var count = 1L
    for (i in 1..b.toInt()) {
        count += 1L shl i
    }
    println(if (n > count) "no" else "yes")
}
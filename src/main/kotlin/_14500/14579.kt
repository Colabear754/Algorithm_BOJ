package _14500

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    var sum = 1
    for (i in a..b) {
        sum *= (i * (i + 1)) / 2
        sum %= 14579
    }
    println(sum)
}
package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 1) return@with println(0)
    var result = 2
    repeat(n - 2) { result *= 3 }
    println(result)
}
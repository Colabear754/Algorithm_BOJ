package _28300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 6
    if (n == 10) {
        println(result)
        return@with
    }
    for (i in 11..n) {
        result *= i
    }
    println(result)
}
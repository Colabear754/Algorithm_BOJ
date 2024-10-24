package _31400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 1L
    for (i in 1..n step 2) result *= i
    println(result)
}
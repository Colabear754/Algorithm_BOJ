package _15100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = n + 1
    while ('0' in "$result") result++
    println(result)
}
package _31800

fun main() = with(System.`in`.bufferedReader()) {
    val prices = IntArray(1) + IntArray(readLine().toInt()) { readLine().toInt() }
    var result = 0
    repeat(readLine().toInt()) { result += prices[readLine().toInt()] }
    println(result)
}
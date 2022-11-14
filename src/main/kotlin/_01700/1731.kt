package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { readLine().toInt() }
    println(if (arr[2] - arr[1] == arr[1] - arr[0]) arr[n - 1] + arr[1] - arr[0] else arr[n - 1] * (arr[1] / arr[0]))
}
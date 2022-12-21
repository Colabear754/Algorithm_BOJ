package _01600

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var count = 0
    while (n > 0) count += (n / 5).also { n = it }
    println(count)
}
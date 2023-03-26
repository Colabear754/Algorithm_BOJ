package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(n) { readLine().toInt() }.sorted()
    var start = 0
    var end = 1
    var min = Int.MAX_VALUE
    while (start < n && end < n) {
        val sub = arr[end] - arr[start]
        if (sub == m) {
            println(sub)
            return@with
        }
        if (sub > m) {
            start++
            min = minOf(min, sub)
        }
        else end++
    }
    println(min)
}
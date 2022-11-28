package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val arr = IntArray(9) { readLine().toInt() }
    var max = 0
    for (n in arr) {
        max = maxOf(n, max)
    }
    println("$max\n${arr.indexOf(max) + 1}")
}
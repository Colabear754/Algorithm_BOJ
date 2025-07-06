package _02400

fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    var current = 0
    repeat(10) {
        val (out, `in`) = readLine().split(' ').map { it.toInt() }
        current -= out
        current += `in`
        max = maxOf(max, current)
    }
    println(max)
}
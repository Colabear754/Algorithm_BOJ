package _11600

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine()
    var level = 0
    while (n.length > 1) {
        n = "${n.map { it - '0' }.reduce { acc, i -> acc * i }}"
        level++
    }
    println(level)
}
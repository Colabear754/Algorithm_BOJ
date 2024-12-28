package _23800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()
    var result = 0L
    var current = n
    repeat(n.length) {
        result += current.toLong()
        current = current.last() + current.dropLast(1)
    }
    println(result)
}
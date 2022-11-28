package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, v) = readLine().split(' ').map { it.toInt() }
    val d = if ((v - a) % (a - b) == 0) (v - a) / (a - b) else (v - a) / (a - b) + 1
    println(d + 1)
}
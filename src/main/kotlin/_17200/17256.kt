package _17200

fun main() = with(System.`in`.bufferedReader()) {
    val cake = Array(2) { readLine().split(' ').map { it.toInt() } }
    println("${cake[1][0] - cake[0][2]} ${cake[1][1] / cake[0][1]} ${cake[1][2] - cake[0][0]}")
}
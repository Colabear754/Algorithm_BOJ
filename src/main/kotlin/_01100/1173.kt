package _01100

fun main() {
    val (N, m, M, T, R) = readln().split(" ").map { it.toInt() }
    var time = 0
    var exercise = 0
    var curr = m
    if (m + T > M) {
        println(-1)
        return
    }
    while (exercise < N) {
        if (curr + T <= M) {
            curr += T
            exercise++
        } else {
            curr = if (curr - R < m) m else curr - R
        }
        time++
    }
    println(time)
}
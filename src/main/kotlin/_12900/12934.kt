package _12900

fun main() = with(System.`in`.bufferedReader()) {
    var (x, y) = readLine().split(' ').map { it.toLong() }
    val totalScore = x + y
    var lastTurn = 1L
    while (true) {
        val checkTotal = lastTurn * (lastTurn + 1) / 2
        if (checkTotal > totalScore) {
            println(-1)
            return@with
        } else if (checkTotal == totalScore) {
            break
        }
        lastTurn++
    }

    var count = 0
    while (x > 0) {
        x -= lastTurn--
        count++
    }
    println(count)
}
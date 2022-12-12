package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val c = readLine()
    var score = when (c[0]) {
        'A' -> 4.0
        'B' -> 3.0
        'C' -> 2.0
        'D' -> 1.0
        else -> 0.0
    }
    if (c.contains('+')) score += 0.3
    if (c.contains('-')) score -= 0.3
    println(score)
}
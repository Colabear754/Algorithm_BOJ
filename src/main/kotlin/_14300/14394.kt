package _14300

fun main() = with(System.`in`.bufferedReader()) {
    val counts = IntArray(4)
    readLine().forEach { when (it) {
        'R' -> counts[0]++
        'G' -> counts[1]++
        'B' -> counts[2]++
        'Y' -> counts[3]++
    } }
    readLine().forEach { when (it) {
        'R' -> counts[0]--
        'G' -> counts[1]--
        'B' -> counts[2]--
        'Y' -> counts[3]--
    } }
    println(counts.sumOf { if (it >= 0) it else 0 })
}
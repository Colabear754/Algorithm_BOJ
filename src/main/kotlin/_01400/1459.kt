package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, w, s) = readLine().split(' ').map { it.toLong() }
    if (s >= 2 * w) {
        return@with println((x + y) * w)
    }
    val min = minOf(x, y)
    val max = maxOf(x, y)
    val diff = max - min
    if (s >= w) return@with println(min * s + diff * w)
    if (diff and 1L == 0L) return@with println(max * s)
    println((max - 1) * s + w)
}
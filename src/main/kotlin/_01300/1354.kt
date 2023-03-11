package _01300

private val map = HashMap<Long, Long>()

fun main() = with(System.`in`.bufferedReader()) {
    val (n, p, q, x, y) = readLine().split(' ').map { it.toLong() }
    map[0] = 1L
    println(sequence(n, p, q, x, y))
}

private fun sequence(n: Long, p: Long, q: Long, x: Long, y: Long): Long {
    if (n <= 0L) return 1
    return map[n] ?: (sequence(n / p - x, p, q, x, y) + sequence(n / q - y, p, q, x, y)).also { map[n] = it }
}

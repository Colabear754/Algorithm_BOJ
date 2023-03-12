package _01300

private val map = HashMap<Long, Long>()

fun main() = with(System.`in`.bufferedReader()) {
    val (n, p, q) = readLine().split(' ').map { it.toLong() }
    map[0] = 1L
    println(sequence(n, p, q))
}

private fun sequence(n: Long, p: Long, q: Long): Long {
    if (n == 0L) return 1
    return map[n] ?: (sequence(n / p, p, q) + sequence(n / q, p, q)).also { map[n] = it }
}
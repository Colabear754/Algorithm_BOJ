package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val (k, n) = readLine().split(' ').map { it.toInt() }
    val cable = LongArray(k) { readLine().toLong() }
    var start = 0L
    var end = cable.maxOrNull()!! + 1
    while (start + 1 < end) {
        var lan = 0L
        val length = (start + end) / 2
        for (c in cable) {
            lan += c / length
        }

        if (lan >= n) start = length
        else end = length
    }
    println(start)
}
package _14200

fun main() = with(System.`in`.bufferedReader()) {
    var (a, b, c, d, u) = readLine().split(' ').map { it.toLong() }
    var count = 0L
    if (a <= u) count = (u - a) / b + 1
    if (d == 1L && c <= u) {
        if (c < a || (c - a) % b != 0L) count++
    } else {
        while (c <= u) {
            if (c < a || (c - a) % b != 0L) count++
            c *= d
        }
    }
    println(count)
}
package _16900

fun main() = with(System.`in`.bufferedReader()) {
    var (a, b) = readLine().split(' ').map { it.toLong() }
    var count = 1
    while (a < b) {
        b /= if (b % 10 == 1L) 10 else if (b % 2 == 0L) 2 else break
        count++
    }
    println(if (a == b) count else -1)
}
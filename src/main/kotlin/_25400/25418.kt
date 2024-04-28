package _25400

fun main() = with(System.`in`.bufferedReader()) {
    val (a, k) = readLine().split(' ').map { it.toInt() }
    var count = 0
    var current = k
    while (current != a) {
        if (current and 1 == 0 && current / 2 >= a) {
            current /= 2
        } else {
            current--
        }
        count++
    }
    println(count)
}
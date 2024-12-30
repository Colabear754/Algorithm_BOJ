package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c, n) = readLine().split(' ').map { it.toInt() }
    for (i in 0..n) {
        for (j in 0..n) {
            for (k in 0..n) {
                if (a * i + b * j + c * k == n) {
                    println(1)
                    return@with
                }
            }
        }
    }
    println(0)
}
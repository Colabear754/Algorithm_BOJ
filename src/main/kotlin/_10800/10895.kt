package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val (a, k) = readLine().split(' ').map { it.toInt() }
    if (k == 0) {
        println(a)
        return@with
    }
    println(if (a and 1 == 0 || a == 1) 1 else a)
}
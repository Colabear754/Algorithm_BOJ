package _27800

fun main() = with(System.`in`.bufferedReader()) {
    val (x, n) = readLine().split(' ').map { it.toInt() }
    var current = x
    repeat(n) {
        current = if (current and 1 == 0) (current / 2) xor 6
        else (current * 2) xor 6
    }
    println(current)
}
package _24300

fun main() = with(System.`in`.bufferedReader()) {
    val (a1, a0) = readLine().split(' ').map(String::toInt)
    val c = readLine().toInt()
    val n0 = readLine().toInt()
    println("${if (a1 * n0 + a0 <= c * n0 && a1 <= c) 1 else 0}")
}
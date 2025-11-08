package _34500

fun main() = with(System.`in`.bufferedReader()) {
    val (x, y, z) = readLine().split(' ').map { it.toInt() }
    val (u, v, w) = readLine().split(' ').map { it.toInt() }
    println(x * u / 100 + y * v / 50 + z * w / 20)
}
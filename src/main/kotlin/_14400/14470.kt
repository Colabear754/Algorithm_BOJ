package _14400

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c, d, e) = IntArray(5) { readLine().toInt() }
    println(if (a < 0) -a * c + d + b * e else (b - a) * e)
}
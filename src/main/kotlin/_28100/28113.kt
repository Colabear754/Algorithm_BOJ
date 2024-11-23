package _28100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, a, b) = readLine().split(' ').map { it.toInt() }
    val subway = if (b >= n) b else b * ((n + b - 1) / b)
    println(if (subway < a) "Subway" else if (a < subway) "Bus" else "Anything")
}
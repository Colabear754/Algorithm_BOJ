package _33200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val minutes = 1440 * m / n
    println("%02d:%02d".format(minutes / 60, minutes % 60))
}
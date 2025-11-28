package _06900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val scores = DoubleArray(n) { readLine().toDouble() }.apply { sort() }
    val trimmedSum = (k..<n - k).sumOf { scores[it] }
    val adjustedSum = trimmedSum + (k * scores[k]) + (k * scores[n - k - 1])
    println("%.2f\n%.2f".format(trimmedSum / (n - 2 * k), adjustedSum / n))
}
package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val rectangle = Array(n) { readLine() }
    var max = 0
    for (i in 0..<n) {
        for (j in 0..<m) {
            for (k in 1..<minOf(n - i, m - j)) {
                if (rectangle[i][j] == rectangle[i + k][j] && rectangle[i][j] == rectangle[i][j + k] && rectangle[i][j] == rectangle[i + k][j + k]) {
                    max = maxOf(max, k)
                }
            }
        }
    }
    println((max + 1) * (max + 1))
}
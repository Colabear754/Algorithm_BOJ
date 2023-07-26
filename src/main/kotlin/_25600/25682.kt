package _25600

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map(String::toInt)
    val board = Array(n) { readLine() }

    fun countChangeColor(color: Char): Int {
        var result = Int.MAX_VALUE
        val sum = Array(n + 1) { IntArray(m + 1) }
        for (i in 1..n) {
            for (j in 1..m) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1]
                if (((i + j) % 2 == 0 && board[i - 1][j - 1] != color) || ((i + j) % 2 == 1 && board[i - 1][j - 1] == color)) sum[i][j]++
            }
        }

        for (i in 1..n - k + 1) {
            for (j in 1..m - k + 1) {
                result = minOf(result, sum[i + k - 1][j + k - 1] - sum[i - 1][j + k - 1] - sum[i + k - 1][j - 1] + sum[i - 1][j - 1])
            }
        }
        return result
    }

    println(minOf(countChangeColor('W'), countChangeColor('B')))
}
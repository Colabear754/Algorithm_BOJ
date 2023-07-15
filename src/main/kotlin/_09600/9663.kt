package _09600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val col = BooleanArray(n)
    val diag1 = BooleanArray(2 * n - 1)
    val diag2 = BooleanArray(2 * n - 1)
    fun nQueen(row: Int, n: Int): Int {
        if (row == n) return 1
        var result = 0
        for (i in 0 until n) {
            if (col[i] || diag1[row + i] || diag2[row - i + n - 1]) continue
            col[i] = true
            diag1[row + i] = true
            diag2[row - i + n - 1] = true
            result += nQueen(row + 1, n)
            col[i] = false
            diag1[row + i] = false
            diag2[row - i + n - 1] = false
        }
        return result
    }

    println(nQueen(0, n))
}
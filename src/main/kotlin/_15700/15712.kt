package _15700

fun main() = with(System.`in`.bufferedReader()) {
    var (a, r, n, mod) = readLine().split(' ').map { it.toLong() }
    var unit = arrayOf(longArrayOf(1, 0), longArrayOf(0, 1))
    var matrix = arrayOf(longArrayOf(r, 0), longArrayOf(a, 1))
    operator fun Array<LongArray>.times(matrix: Array<LongArray>): Array<LongArray> {
        val result = Array(size) { LongArray(matrix[0].size) }
        for (i in indices) {
            for (j in matrix[0].indices) {
                for (k in matrix.indices) {
                    result[i][j] += this[i][k] * matrix[k][j]
                }
                result[i][j] = result[i][j] % mod
            }
        }
        return result
    }
    while (n > 0) {
        if (n % 2 == 1L) {
            unit *= matrix
        }
        matrix *= matrix
        n /= 2
    }
    println(unit[1][0])
}

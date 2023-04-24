package _27400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var base = arrayOf(longArrayOf(1, 0, 0), longArrayOf(0, 1, 0), longArrayOf(0, 0, 1))
        var q_matrix = arrayOf(longArrayOf(0, 1, 0), longArrayOf(0, 0, 1), longArrayOf(1, 1, 0))
        var n = readLine().toLong()
        if (n <= 3) {
            bw.write("1\n")
        } else {
            while (n >= 1) {
                if (n % 2 == 1L) {
                    base *= q_matrix
                }
                q_matrix *= q_matrix
                n /= 2
            }
            bw.write("${base[2][1] % 998244353}\n")
        }
    }
    bw.close()
}

private operator fun Array<LongArray>.times(matrix: Array<LongArray>): Array<LongArray> {
    val result = Array(size) { LongArray(matrix[0].size) }
    for (i in indices) {
        for (j in matrix[0].indices) {
            for (k in matrix.indices) {
                result[i][j] += this[i][k] * matrix[k][j]
            }
            result[i][j] = result[i][j] % 998244353
        }
    }
    return result
}
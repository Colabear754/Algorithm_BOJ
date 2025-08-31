package _17100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, m) = readLine().split(' ').map { it.toInt() }
        val array = Array(n) { StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } } }
        val delta = Array(n + 1) { IntArray(n + 1) }
        repeat(m) {
            val st = StringTokenizer(readLine())
            val (r1, c1, r2, c2) = IntArray(4) { st.nextToken().toInt() - 1 }
            val value = st.nextToken().toInt()
            delta[r1][c1] += value
            delta[r1][c2 + 1] -= value
            delta[r2 + 1][c1] -= value
            delta[r2 + 1][c2 + 1] += value
        }
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (i > 0) delta[i][j] += delta[i - 1][j]
                if (j > 0) delta[i][j] += delta[i][j - 1]
                if (i > 0 && j > 0) delta[i][j] -= delta[i - 1][j - 1]
            }
        }
        for (i in 0..<n) {
            for (j in 0..<n) {
                array[i][j] += delta[i][j]
            }
        }
        array.forEach { bw.write("${it.sum()} ") }
        bw.newLine()
        for (j in 0..<n) {
            var sum = 0
            for (i in 0..<n) sum += array[i][j]
            bw.write("$sum ")
        }
        bw.newLine()
    }
    bw.close()
}
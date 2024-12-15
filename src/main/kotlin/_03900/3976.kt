package _03900

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (n, l1, l2, s1, s2) = readIntArray(5)
        val pass1 = readIntArray(n - 1)
        val dribble1 = readIntArray(n - 1)
        val pass2 = readIntArray(n - 1)
        val dribble2 = readIntArray(n - 1)
        val difficultyLevel = Array(2) { IntArray(n) }
        difficultyLevel[0][0] = l1
        difficultyLevel[1][0] = l2
        for (i in 1..<n) {
            difficultyLevel[0][i] = minOf(difficultyLevel[0][i - 1] + dribble1[i - 1], difficultyLevel[1][i - 1] + pass2[i - 1])
            difficultyLevel[1][i] = minOf(difficultyLevel[1][i - 1] + dribble2[i - 1], difficultyLevel[0][i - 1] + pass1[i - 1])
        }
        bw.write("${minOf(difficultyLevel[0][n - 1] + s1, difficultyLevel[1][n - 1] + s2)}")
        bw.newLine()
    }
    bw.close()
}

private fun BufferedReader.readIntArray(size: Int) = StringTokenizer(readLine()).run { IntArray(size) { nextToken().toInt() } }
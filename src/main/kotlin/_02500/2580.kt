package _02500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val sudoku = Array(9) { StringTokenizer(readLine()).run { IntArray(9) { nextToken().toInt() } } }
    val row = Array(9) { BooleanArray(10) }
    val col = Array(9) { BooleanArray(10) }
    val square = Array(9) { BooleanArray(10) }
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (sudoku[i][j] != 0) {
                row[i][sudoku[i][j]] = true
                col[j][sudoku[i][j]] = true
                square[(i / 3) * 3 + (j / 3)][sudoku[i][j]] = true
            }
        }
    }

    fun dfs(index: Int) {
        if (index == 81) {
            bw.write(sudoku.joinToString("\n") { it.joinToString(" ") })
            bw.close()
            System.exit(0)
        }
        val x = index / 9
        val y = index % 9
        if (sudoku[x][y] == 0) {
            for (i in 1..9) {
                val next = (x / 3) * 3 + (y / 3)
                if (!row[x][i] && !col[y][i] && !square[next][i]) {
                    row[x][i] = true
                    col[y][i] = true
                    square[next][i] = true
                    sudoku[x][y] = i
                    dfs(index + 1)
                    sudoku[x][y] = 0
                    row[x][i] = false
                    col[y][i] = false
                    square[next][i] = false
                }
            }
        } else {
            dfs(index + 1)
        }
    }
    dfs(0)
}
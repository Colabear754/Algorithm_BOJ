package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val board = Array(n) { BooleanArray(m) }    // false : 검은칸, true : 흰칸
    val isWhite = Array(n) { BooleanArray(m) }
    val isBlack = Array(n) { BooleanArray(m) }
    var min = 64
    for (i in 0 until n) {
        val str = readLine()
        for (j in 0 until m) {
            board[i][j] = str[j] == 'W'
            if (((i + j) % 2 == 0 && board[i][j]) || ((i + j) % 2 == 1 && !board[i][j])) {
                isWhite[i][j] = true
            }
            if (((i + j) % 2 == 0 && !board[i][j]) || ((i + j) % 2 == 1 && board[i][j])) {
                isBlack[i][j] = true
            }
        }
    }

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            var whiteCnt = 0
            var blackCnt = 0
            for (x in i until i + 8) {
                for (y in j until j + 8) {
                    if (!isWhite[x][y]) whiteCnt++
                    if (!isBlack[x][y]) blackCnt++
                }
            }
            min = minOf(min, minOf(whiteCnt, blackCnt))
        }
    }

    println(min)
}
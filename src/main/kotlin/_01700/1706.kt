package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val board = Array(r) { readLine() }
    val words = ArrayList<String>()
    for (i in 0..<r) {
        for (j in 0..<c) {
            if (board[i][j] == '#') continue
            if (j == 0 || board[i][j - 1] == '#') {
                var index = j
                for (k in j..<c) {
                    if (board[i][k] == '#') break
                    index = k
                }
                if (index - j > 0) {
                    words.add(board[i].slice(j..index))
                }
            }
            if (i == 0 || board[i - 1][j] == '#') {
                val word = StringBuilder()
                for (k in i..<r) {
                    if (board[k][j] == '#') break
                    word.append(board[k][j])
                }
                if (word.length > 1) {
                    words.add(word.toString())
                }
            }
        }
    }
    println(words.min())
}
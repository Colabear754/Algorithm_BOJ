package _05800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val command = readLine()
    val board = Array(n) { CharArray(n) { '.' } }
    var (h, w) = 0 to 0
    for (c in command) {
        when (c) {
            'U' -> if (h > 0) {
                board.vertical(h, w)
                h--
                board.vertical(h, w)
            }
            'D' -> if (h < n - 1) {
                board.vertical(h, w)
                h++
                board.vertical(h, w)
            }
            'L' -> if (w > 0) {
                board.horizontal(h, w)
                w--
                board.horizontal(h, w)
            }
            'R' -> if (w < n - 1) {
                board.horizontal(h, w)
                w++
                board.horizontal(h, w)
            }
        }
    }
    println(board.joinToString("\n") { it.joinToString("") })
}

private fun Array<CharArray>.vertical(h: Int, w: Int) {
    if (this[h][w] == '.') this[h][w] = '|'
    else if (this[h][w] == '-') this[h][w] = '+'
}

private fun Array<CharArray>.horizontal(h: Int, w: Int) {
    if (this[h][w] == '.') this[h][w] = '-'
    else if (this[h][w] == '|') this[h][w] = '+'
}
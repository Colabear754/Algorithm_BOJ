package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val board = Array(8) { readLine().toCharArray() }
    if (board.none { it.contains('#') }) {
        println(1)
        return@with
    }
    val dr = intArrayOf(0, -1, -1, -1, 0, 0, 1, 1, 1)
    val dc = intArrayOf(0, -1, 0, 1, -1, 1, -1, 0, 1)
    val visited = Array(8) { BooleanArray(8) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(7 to 0)
    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val (r, c) = queue.removeFirst()
            if (r == 0 && c == 7) {
                println(1)
                return@with
            }
            if (board[r][c] == '#') return@repeat
            repeat(9) { i ->
                val nr = r + dr[i]
                val nc = c + dc[i]
                if (nr in 0..7 && nc in 0..7 && board[nr][nc] == '.' && !visited[nr][nc]) {
                    queue.addLast(nr to nc)
                    visited[nr][nc] = true
                }
            }
        }
        for (i in 6 downTo 0) {
            for (j in 0..7) {
                board[i + 1][j] = board[i][j]
            }
        }
        board[0].fill('.')
        visited.forEach { it.fill(false) }
    }
    println(0)
}
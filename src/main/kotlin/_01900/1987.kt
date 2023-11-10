package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val board = Array(r) { readLine() }
    val visited = BooleanArray(26)
    visited[board[0][0] - 'A'] = true
    var answer = 0
    val dx = intArrayOf(0, 0, -1, 1)
    val dy = intArrayOf(-1, 1, 0, 0)
    fun dfs(x: Int, y: Int, count: Int) {
        answer = maxOf(answer, count)
        for (i in 0..<4) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0..<r && ny in 0..<c && !visited[board[nx][ny] - 'A']) {
                visited[board[nx][ny] - 'A'] = true
                dfs(nx, ny, count + 1)
                visited[board[nx][ny] - 'A'] = false
            }
        }
    }
    dfs(0, 0, 1)
    println(answer)
}
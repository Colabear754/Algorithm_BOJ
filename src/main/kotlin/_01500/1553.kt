package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val grid = Array(8) { readLine().map { it - '0' } }
    val used = Array(7) { BooleanArray(7) }
    val visited = Array(8) { BooleanArray(7) }
    val dr = intArrayOf(0, 1)
    val dc = intArrayOf(1, 0)
    fun backtrack(r: Int, c: Int, dominoes: Int): Int {
        if (r * 7 + c >= 56 && dominoes == 56) return 1
        if (visited[r][c]) return backtrack(r + (c + 1) / 7, (c + 1) % 7, dominoes)
        var count = 0
        repeat(2) {
            val nr = r + dr[it]
            val nc = c + dc[it]
            if (nr >= 8 || nc >= 7) {
                return@repeat
            }
            val first = grid[r][c]
            val second = grid[nr][nc]
            if (!visited[nr][nc] && !used[first][second]) {
                visited[r][c] = true
                visited[nr][nc] = true
                used[first][second] = true
                used[second][first] = true
                count += backtrack(r + (c + 1) / 7, (c + 1) % 7, dominoes + 2)
                visited[r][c] = false
                visited[nr][nc] = false
                used[first][second] = false
                used[second][first] = false
            }
        }
        return count
    }
    println(backtrack(0, 0, 0))
}
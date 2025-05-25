package _13500

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(' ').map { it.toInt() }
    val map = Array(m) { readLine() }
    val visited = Array(m) { BooleanArray(n) }
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    val queue = ArrayDeque<Pair<Int, Int>>()
    for (i in 0..<n) {
        if (map[0][i] == '0') {
            queue.add(0 to i)
            visited[0][i] = true
        }
    }
    while (queue.isNotEmpty()) {
        val (r, c) = queue.removeFirst()
        if (r == m - 1) {
            return@with println("YES")
        }
        for (i in 0..3) {
            val nr = r + dr[i]
            val nc = c + dc[i]
            if (nr in 0..<m && nc in 0..<n && map[nr][nc] == '0' && !visited[nr][nc]) {
                visited[nr][nc] = true
                queue.add(nr to nc)
            }
        }
    }
    println("NO")
}
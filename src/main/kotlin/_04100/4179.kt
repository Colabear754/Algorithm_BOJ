package _04100

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val map = Array(r) { readLine().toCharArray() }
    val visited = Array(r) { BooleanArray(c) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    val fire = ArrayDeque<Pair<Int, Int>>()
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    var time = 0
    for (i in 0..<r) {
        for (j in 0..<c) {
            if (map[i][j] == 'F') {
                fire.add(i to j)
                continue
            }
            if (map[i][j] == 'J') {
                queue.add(i to j)
                visited[i][j] = true
            }
        }
    }
    while (queue.isNotEmpty()) {
        time++
        for (i in 0..<fire.size) {
            val (cr, cc) = fire.removeFirst()
            for (j in 0..<4) {
                val nr = cr + dr[j]
                val nc = cc + dc[j]
                if (nr < 0 || nr >= r || nc < 0 || nc >= c) continue
                if (map[nr][nc] == '#' || map[nr][nc] == 'F') continue
                map[nr][nc] = 'F'
                fire.add(nr to nc)
            }
        }
        for (i in 0..<queue.size) {
            val (cr, cc) = queue.removeFirst()
            for (j in 0..<4) {
                val nx = cr + dr[j]
                val ny = cc + dc[j]
                if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                    println(time)
                    return@with
                }
                if (map[nx][ny] == '#' || map[nx][ny] == 'F' || visited[nx][ny]) continue
                visited[nx][ny] = true
                queue.add(nx to ny)
            }
        }
    }
    println("IMPOSSIBLE")
}
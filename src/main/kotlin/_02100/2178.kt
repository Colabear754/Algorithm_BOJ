package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val maze = Array(n) { readLine().toCharArray() }
    val visited = Array(n) { BooleanArray(m) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    val dx = arrayOf(0, 0, 1, -1)
    val dy = arrayOf(1, -1, 0, 0)
    queue.add(0 to 0)
    visited[0][0] = true
    var count = 1
    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val (x, y) = queue.removeFirst()
            if (x == n - 1 && y == m - 1) {
                println(count)
                return@with
            }
            for (i in 0..3) {
                val nx = x + dx[i]
                val ny = y + dy[i]
                if (nx in 0 until n && ny in 0 until m && maze[nx][ny] == '1' && !visited[nx][ny]) {
                    queue.add(nx to ny)
                    visited[nx][ny] = true
                }
            }
        }
        count++
    }
}
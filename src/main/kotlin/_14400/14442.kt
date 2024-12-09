package _14400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, k) = readLine().split(' ').map { it.toInt() }
    val map = Array(n) { readLine().toCharArray() }
    val queue = ArrayDeque<Point>()
    queue.add(Point(0, 0, 0))
    val distance = Array(n) { Array(m) { IntArray(k + 1) } }
    distance[0][0][0] = 1
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    while (queue.isNotEmpty()) {
        val point = queue.removeFirst()
        if (point.x == n - 1 && point.y == m - 1) {
            println(distance[point.x][point.y][point.breakCount])
            return
        }
        for (i in 0..<4) {
            val nx = point.x + dx[i]
            val ny = point.y + dy[i]
            if (nx in 0..<n && ny in 0..<m) {
                if (map[nx][ny] == '0' && distance[nx][ny][point.breakCount] == 0) {
                    distance[nx][ny][point.breakCount] = distance[point.x][point.y][point.breakCount] + 1
                    queue.add(Point(nx, ny, point.breakCount))
                }
                val nextBreakCount = point.breakCount + 1
                if (point.breakCount < k && map[nx][ny] == '1' && distance[nx][ny][nextBreakCount] == 0) {
                    distance[nx][ny][nextBreakCount] = distance[point.x][point.y][point.breakCount] + 1
                    queue.add(Point(nx, ny, nextBreakCount))
                }
            }
        }
    }
    println(-1)
}

private class Point(val x: Int, val y: Int, val breakCount: Int)
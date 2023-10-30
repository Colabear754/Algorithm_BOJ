package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = Array(n) { readLine().toCharArray() }
    val queue = ArrayDeque<Point>()
    queue.add(Point(0, 0, 0))
    val distance = Array(n) { Array(m) { IntArray(2) } }
    distance[0][0][0] = 1
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    while (queue.isNotEmpty()) {
        val point = queue.removeFirst()
        if (point.x == n - 1 && point.y == m - 1) {
            println(distance[point.x][point.y][point.isBreak])
            return
        }
        for (i in 0 until 4) {
            val nx = point.x + dx[i]
            val ny = point.y + dy[i]
            if (nx in 0 until n && ny in 0 until m) {
                if (map[nx][ny] == '0' && distance[nx][ny][point.isBreak] == 0) {
                    distance[nx][ny][point.isBreak] = distance[point.x][point.y][point.isBreak] + 1
                    queue.add(Point(nx, ny, point.isBreak))
                }
                if (point.isBreak == 0 && map[nx][ny] == '1' && distance[nx][ny][1] == 0) {
                    distance[nx][ny][1] = distance[point.x][point.y][0] + 1
                    queue.add(Point(nx, ny, 1))
                }
            }
        }
    }
    println(-1)
}

private class Point(val x: Int, val y: Int, val isBreak: Int)
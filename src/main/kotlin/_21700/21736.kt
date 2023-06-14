package _21700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map(String::toInt)
    val queue = ArrayDeque<Pair<Int, Int>>()
    val campus = Array(n) { i -> readLine().toCharArray().apply { if (contains('I')) queue.add(i to indexOf('I')) } }
    val visited = Array(n) { BooleanArray(m) }
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    var count = 0
    while (queue.isNotEmpty()) {
        val (x, y) = queue.removeFirst()
        visited[x][y] = true
        for (i in 0..3) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx in 0 until n && ny in 0 until m && campus[nx][ny] != 'X' && !visited[nx][ny]) {
                visited[nx][ny] = true
                if (campus[nx][ny] == 'P') count++
                queue.add(nx to ny)
            }
        }
    }
    println(if (count == 0) "TT" else count)
}
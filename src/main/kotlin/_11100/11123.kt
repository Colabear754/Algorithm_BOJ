package _11100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    repeat(readLine().toInt()) {
        val (h, w) = readLine().split(' ').map { it.toInt() }
        val map = Array(h) { readLine() }
        val visited = Array(h) { BooleanArray(w) }
        var count = 0
        val queue = ArrayDeque<Pair<Int, Int>>()
        for (i in 0..<h) {
            for (j in 0..<w) {
                if (map[i][j] == '#' && !visited[i][j]) {
                    queue.add(i to j)
                    visited[i][j] = true
                    while (queue.isNotEmpty()) {
                        val current = queue.removeFirst()
                        for (k in 0..3) {
                            val nr = current.first + dx[k]
                            val nc = current.second + dy[k]
                            if (nr in 0..<h && nc in 0..<w && !visited[nr][nc] && map[nr][nc] == '#') {
                                visited[nr][nc] = true
                                queue.add(Pair(nr, nc))
                            }
                        }
                    }
                    count++
                }
            }
        }
        bw.write("$count\n")
    }
    bw.close()
}
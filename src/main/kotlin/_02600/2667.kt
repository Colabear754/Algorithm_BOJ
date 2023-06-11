package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val development = Array(n) { readLine().toCharArray() }
    val visited = Array(n) { BooleanArray(n) }
    val queue = ArrayDeque<Pair<Int, Int>>()
    val dx = intArrayOf(0, 0, 1, -1)
    val dy = intArrayOf(1, -1, 0, 0)
    val result = ArrayList<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (development[i][j] == '1' && !visited[i][j]) {
                queue.add(i to j)
                visited[i][j] = true
                var count = 1
                while (queue.isNotEmpty()) {
                    repeat(queue.size) {
                        val (x, y) = queue.removeFirst()
                        for (k in 0..3) {
                            val nx = x + dx[k]
                            val ny = y + dy[k]
                            if (nx in 0 until n && ny in 0 until n && development[nx][ny] == '1' && !visited[nx][ny]) {
                                queue.add(nx to ny)
                                visited[nx][ny] = true
                                count++
                            }
                        }
                    }
                }
                result.add(count)
            }
        }
    }
    bw.write("${result.size}\n")
    bw.write(result.sorted().joinToString("\n"))
    bw.close()
}
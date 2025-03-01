package _15800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var total = 0
    val planetMap = Array(n) { readLine().toCharArray().also { total += it.count { c ->  c == '1' } } }
    var min = Int.MAX_VALUE
    val queue = ArrayDeque<Pair<Int, Int>>()
    val visited = Array(n) { BooleanArray(m) }
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    var infested: Int
    var time: Int
    for (i in 0..<n * m) {
        val r1 = i / m
        val c1 = i % m
        if (planetMap[r1][c1] == '1') continue
        for (j in i + 1..<n * m) {
            val r2 = j / m
            val c2 = j % m
            if (planetMap[r2][c2] == '1') continue
            time = 0
            infested = 0
            queue.clear()
            visited.forEach { it.fill(false) }
            queue.add(r1 to c1)
            queue.add(r2 to c2)
            visited[r1][c1] = true
            visited[r2][c2] = true
            while (queue.isNotEmpty()) {
                if (infested == total) break
                repeat(queue.size) {
                    val (r, c) = queue.removeFirst()
                    for (k in 0..3) {
                        val nr = r + dr[k]
                        val nc = c + dc[k]
                        if (nr !in 0..<n || nc !in 0..<m || visited[nr][nc]) continue
                        visited[nr][nc] = true
                        infested += planetMap[nr][nc] - '0'
                        queue.add(nr to nc)
                    }
                }
                time++
            }
            min = minOf(min, time)
        }
    }
    println(min)
}
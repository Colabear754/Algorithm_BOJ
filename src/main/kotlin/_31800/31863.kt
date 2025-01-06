package _31800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val map = Array(n) { readLine().toCharArray() }
    val epicenter = ArrayDeque<Pair<Int, Int>>()
    val durability = Array(n) { IntArray(m) }
    var buildingCount = 0
    var destroiedCount = 0
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (map[i][j] == '@') epicenter.add(i to j)
            durability[i][j] = when (map[i][j]) {
                '#' -> 2.also { buildingCount++ }
                '*' -> 1.also { buildingCount++ }
                else -> 0
            }
        }
    }
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    fun earthquake(r: Int, c: Int, count: Int) {
        for (i in 0..3) {
            var nr = r
            var nc = c
            for (j in 1..count) {
                nr += dr[i]
                nc += dc[i]
                if (nr !in 0..<n || nc !in 0..<m || map[nr][nc] == '|') break
                if (durability[nr][nc] == 0) continue
                if (--durability[nr][nc] == 0) {
                    buildingCount--
                    destroiedCount++
                    epicenter.add(nr to nc)
                }
            }
        }
    }
    val (startR, startC) = epicenter.removeFirst()
    earthquake(startR, startC, 2)
    while (epicenter.isNotEmpty()) {
        val (r, c) = epicenter.removeFirst()
        earthquake(r, c, 1)
    }
    println("$destroiedCount $buildingCount")
}

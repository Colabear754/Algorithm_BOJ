package _05200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val map = Array(r) { readLine().toCharArray() }
    val dr = intArrayOf(0, 0, 1, -1)
    val dc = intArrayOf(1, -1, 0, 0)
    var minR = r
    var maxR = 0
    var minC = c
    var maxC = 0
    for (i in 0..<r) {
        for (j in 0..<c) {
            if (map[i][j] == 'X') {
                var count = 0
                repeat(4) {
                    val nr = i + dr[it]
                    val nc = j + dc[it]
                    if (nr < 0 || nc < 0 || nr >= r || nc >= c || map[nr][nc] == '.') {
                        count++
                    }
                }
                if (count >= 3) {
                    map[i][j] = '#'
                }
            }
            if (map[i][j] == 'X') {
                minR = minOf(minR, i)
                maxR = maxOf(maxR, i)
                minC = minOf(minC, j)
                maxC = maxOf(maxC, j)
            }
        }
    }
    for (i in minR..maxR) {
        for (j in minC..maxC) {
            bw.write(if (map[i][j] == 'X') "X" else ".")
        }
        bw.newLine()
    }
    bw.close()
}
package _04900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: String
    while (readLine().also { input = it } != "0 0") {
        val (w, h) = input.toIntArray(2)
        val map = Array(h) { readLine().toIntArray(w) }
        var count = 0
        val dr = intArrayOf(-1, 1, 0, 0, -1, -1, 1, 1)
        val dc = intArrayOf(0, 0, -1, 1, -1, 1, -1, 1)
        val queue = ArrayDeque<IntArray>()
        for (r in map.indices) {
            for (c in map[r].indices) {
                if (map[r][c] == 0) continue
                queue.add(intArrayOf(r, c))
                map[r][c] = 0
                while (queue.isNotEmpty()) {
                    val (cr, cc) = queue.removeFirst()
                    for (i in dr.indices) {
                        val nr = cr + dr[i]
                        val nc = cc + dc[i]
                        if (nr in map.indices && nc in map[nr].indices && map[nr][nc] == 1) {
                            queue.add(intArrayOf(nr, nc))
                            map[nr][nc] = 0
                        }
                    }
                }
                count++
            }
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}

private fun String.toIntArray(n: Int) = StringTokenizer(this).run { IntArray(n) { nextToken().toInt() } }
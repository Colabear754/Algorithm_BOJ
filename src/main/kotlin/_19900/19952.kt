package _19900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val (h, w, o, f) = IntArray(4) { st.nextToken().toInt() }
        val (sr, sc, er, ec) = IntArray(4) { st.nextToken().toInt() - 1 }
        val map = Array(h) { IntArray(w) }
        repeat(o) {
            StringTokenizer(readLine()).run { map[nextToken().toInt() - 1][nextToken().toInt() - 1] = nextToken().toInt() }
        }
        val dr = intArrayOf(0, 0, 1, -1)
        val dc = intArrayOf(1, -1, 0, 0)
        val visited = Array(h) { BooleanArray(w) }
        val queue = ArrayDeque<Inseong>()
        queue.add(Inseong(sr, sc, f))
        while (queue.isNotEmpty()) {
            val (r, c, force) = queue.removeFirst()
            if (r == er && c == ec) {
                bw.write("잘했어!!\n")
                return@repeat
            }
            repeat(4) { i ->
                val nr = r + dr[i]
                val nc = c + dc[i]
                if (nr in 0..<h && nc in 0..<w && !visited[nr][nc] && force > 0 && map[nr][nc] - map[r][c] <= force) {
                    visited[nr][nc] = true
                    queue.add(Inseong(nr, nc, force - 1))
                }
            }
        }
        bw.write("인성 문제있어??\n")
    }
    bw.close()
}

private class Inseong(val r: Int, val c: Int, val f: Int) {
    operator fun component1() = r
    operator fun component2() = c
    operator fun component3() = f
}
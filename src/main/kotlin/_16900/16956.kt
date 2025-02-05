package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val (r, c) = readLine().split(' ').map { it.toInt() }
    val pasture = Array(r) { readLine().toCharArray() }
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)
    for (i in 0..<r) {
        for (j in 0..<c) {
            if (pasture[i][j] == 'W') {
                for (k in 0..3) {
                    val nr = i + dr[k]
                    val nc = j + dc[k]
                    if (nr in 0..<r && nc in 0..<c) {
                        if (pasture[nr][nc] == 'S') {
                            println(0)
                            return@with
                        }
                        if (pasture[nr][nc] == '.') {
                            pasture[nr][nc] = 'D'
                        }
                    }
                }
            }
        }
    }
    println("1\n${pasture.joinToString("\n") { it.joinToString("") }}")
}
package _31900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val board = Array(n) { readLine() }
    val dr = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
    val dc = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
    var count = 0
    for (i in 0..<n) {
        for (j in 0..<n) {
            direction@ for (k in 0..7) {
                for (l in 0..4) {
                    if (i + dr[k] * l !in 0..<n || j + dc[k] * l !in 0..<n) continue@direction
                    if (board[i + dr[k] * l][j + dc[k] * l] != "MOBIS"[l]) continue@direction
                }
                count++
            }
        }
    }
    println(count)
}
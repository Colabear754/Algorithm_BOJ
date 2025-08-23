package _10100

fun main() = with(System.`in`.bufferedReader()) {
    val (c, r) = readLine().split(' ').map { it.toInt() }
    val k = readLine().toInt()
    if (k > c * r) {
        return@with println(0)
    }
    val concertHall = Array(r) { IntArray(c) }
    val dr = intArrayOf(-1, 0, 1, 0)
    val dc = intArrayOf(0, 1, 0, -1)
    var direction = 0
    var row = r - 1
    var column = 0
    for (i in 1..<k) {
        concertHall[row][column] = i
        val nr = row + dr[direction]
        val nc = column + dc[direction]
        if (nr !in 0..<r || nc !in 0..<c || concertHall[nr][nc] != 0) {
            direction = (direction + 1) % 4
        }
        row += dr[direction]
        column += dc[direction]
    }
    println("${column + 1} ${r - row}")
}
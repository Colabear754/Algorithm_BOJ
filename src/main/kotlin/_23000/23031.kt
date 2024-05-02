package _23000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val move = readLine()
    val zombies = mutableListOf<Zombie>()
    val dasol = Array(n) { i -> readLine().apply { forEachIndexed { j, c -> if (c == 'Z') zombies.add(Zombie(i, j)) } } }
    val isLighting = Array(n) { BooleanArray(n) }
    var direction = 0   // 0: down, 1: left, 2: up, 3: right
    var (r, c) = 0 to 0
    val dr = intArrayOf(1, 0, -1, 0)
    val dc = intArrayOf(0, -1, 0, 1)
    for (command in move) {
        when (command) {
            'L' -> direction = (direction + 3) % 4
            'R' -> direction = (direction + 1) % 4
            'F' -> {
                val nr = r + dr[direction]
                val nc = c + dc[direction]
                if (nr in 0..<n && nc in 0..<n) {
                    r = nr
                    c = nc
                }
            }
        }
        if (dasol[r][c] == 'S') {
            for (i in maxOf(0, r - 1)..minOf(n - 1, r + 1)) {
                for (j in maxOf(0, c - 1)..minOf(n - 1, c + 1)) {
                    isLighting[i][j] = true
                }
            }
        }
        for (zombie in zombies) {
            if (r == zombie.r && c == zombie.c && !isLighting[r][c]) {
                println("Aaaaaah!")
                return@with
            }
            if (zombie.r + zombie.direction in 0..<n) zombie.r += zombie.direction
            else zombie.direction = -zombie.direction
            if (r == zombie.r && c == zombie.c && !isLighting[r][c]) {
                println("Aaaaaah!")
                return@with
            }
        }
    }
    println("Phew...")
}

private class Zombie(var r: Int, val c: Int, var direction: Int = 1)
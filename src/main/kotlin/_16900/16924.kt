package _16900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val board = Array(n) { readLine().toCharArray() }
    val answer = mutableListOf<Triple<Int, Int, Int>>()
    val check = Array(n) { BooleanArray(m) }
    for (i in 1..<n - 1) {
        for (j in 1..<m - 1) {
            if (board[i][j] == '*') {
                var size = 1
                while (true) {
                    if (i < size || i + size >= n || j < size || j + size >= m) break
                    if (board[i - size][j] == '.' || board[i + size][j] == '.' || board[i][j - size] == '.' || board[i][j + size] == '.') break
                    check[i][j] = true
                    check[i - size][j] = true
                    check[i + size][j] = true
                    check[i][j - size] = true
                    check[i][j + size] = true
                    answer.add(Triple(i + 1, j + 1, size))
                    size++
                }
            }
        }
    }
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (board[i][j] == '*' && !check[i][j]) {
                println(-1)
                return@with
            }
        }
    }
    println("${answer.size}\n${answer.joinToString("\n") { "${it.first} ${it.second} ${it.third}" }}")
}
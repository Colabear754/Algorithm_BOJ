package _01400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val coins = Array(n) { readLine().map { it == '0' }.toBooleanArray() }
    var count = 0
    for (i in n - 1 downTo 0) {
        for (j in m - 1 downTo 0) {
            if (coins[i][j]) continue
            count++
            for (x in 0..i) {
                for (y in 0..j) {
                    coins[x][y] = !coins[x][y]
                }
            }
        }
    }
    println(count)
}
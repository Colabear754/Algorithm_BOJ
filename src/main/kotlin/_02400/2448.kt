package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { CharArray(2 * n) { ' ' } }.apply { star(0, n - 1, n) }
    println(arr.joinToString("\n") { it.joinToString("") })
}

private fun Array<CharArray>.star(x: Int, y: Int, n: Int) {
    if (n == 3) {
        this[x][y] = '*'
        this[x + 1][y - 1] = '*'
        this[x + 1][y + 1] = '*'
        for (i in -2..2) this[x + 2][y + i] = '*'
        return
    }
    star(x, y, n / 2)
    star(x + n / 2, y - n / 2, n / 2)
    star(x + n / 2, y + n / 2, n / 2)
}
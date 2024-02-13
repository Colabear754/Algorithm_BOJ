package _10900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val size = { it: Int -> 4 * it - 3 }
    val arr = Array(size(n)) { CharArray(size(n)) { ' ' } }
    fun star(x: Int, y: Int, n: Int) {
        if (n == 1) {
            arr[x][y] = '*'
            return
        }
        for (i in x..<x + size(n)) {
            arr[i][y] = '*'
            arr[i][y + size(n) - 1] = '*'
        }
        for (i in y..<y + size(n)) {
            arr[x][i] = '*'
            arr[x + size(n) - 1][i] = '*'
        }
        star(x + 2, y + 2, n - 1)
    }
    star(0, 0, n)
    println(arr.joinToString("\n") { it.joinToString("") })
}
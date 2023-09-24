package _30000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (x, y, r) = readLine().split(' ').map { it.toInt() }
    val lines = IntArray(n) { readLine().toInt() }
    var (a, b) = 0 to 0
    val (min, max) = x - r to x + r
    for (line in lines) {
        if (line in min + 1 until max) a++
        if (line == min || line == max) b++
    }
    println("$a $b")
}
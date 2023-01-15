package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val points = Array(3) { readLine().split(' ').map { it.toInt() } }
    var (x, y) = listOf(0, 0)
    for (i in 0..2) {
        x = points[i][0].takeIf { n -> points.count { it[0] == n } == 1 } ?: x
        y = points[i][1].takeIf { n -> points.count { it[1] == n } == 1 } ?: y
    }
    println("$x $y")
}
package _22200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k, p, x) = readLine().split(' ').map { it.toInt() }
    val display = arrayOf(
        booleanArrayOf(true, true, true, false, true, true, true),
        booleanArrayOf(false, false, true, false, false, true, false),
        booleanArrayOf(false, true, true, true, true, false, true),
        booleanArrayOf(false, true, true, true, false, true, true),
        booleanArrayOf(true, false, true, true, false, true, false),
        booleanArrayOf(true, true, false, true, false, true, true),
        booleanArrayOf(true, true, false, true, true, true, true),
        booleanArrayOf(false, true, true, false, false, true, false),
        booleanArrayOf(true, true, true, true, true, true, true),
        booleanArrayOf(true, true, true, true, false, true, true)
    )
    var result = 0
    repeat(n) {
        if (it + 1 == x) return@repeat
        var count = 0
        var from = x
        var to = it + 1
        repeat(k) {
            repeat(7) { i -> if (display[from % 10][i] != display[to % 10][i]) count++ }
            from /= 10
            to /= 10
        }
        if (count <= p) result++
    }
    println(result)
}
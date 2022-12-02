package _18100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, b) = readLine().split(' ').map { it.toInt() }
    val arr = Array(n) { readLine().split(' ').map { it.toInt() } }
    var k = 257
    var minTime = Int.MAX_VALUE
    var minHeight = 0
    while (k-- > 0) {
        var timeSum = 0
        var remain = b
        for (i in 0 until n) {
            for (j in 0 until m) {
                val gap = k - arr[i][j]
                if (gap >= 0) {
                    timeSum += gap
                    remain -= gap
                } else {
                    timeSum -= 2 * gap
                    remain -= gap
                }
            }
        }
        if (remain >= 0 && timeSum < minTime) {
            minTime = timeSum
            minHeight = k
        }
    }
    println("$minTime $minHeight")
}
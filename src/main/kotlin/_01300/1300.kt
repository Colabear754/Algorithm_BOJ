package _01300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val k = readLine().toInt()
    var left = 1
    var right = k
    while (left <= right) {
        val mid = (left + right) / 2
        var count = 0L
        for (i in 1..n) {
            count += minOf(mid / i, n)
        }
        if (count < k) left = mid + 1
        else right = mid - 1
    }
    println(left)
}
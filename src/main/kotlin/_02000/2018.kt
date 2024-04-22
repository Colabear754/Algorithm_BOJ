package _02000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0
    var start = 1
    var end = 1
    while (end <= n) {
        val sum = (end - start + 1) * (start + end) / 2
        if (sum == n) {
            count++
            start++
            end++
        } else if (sum < n) {
            end++
        } else {
            start++
        }
    }
    println(count)
}
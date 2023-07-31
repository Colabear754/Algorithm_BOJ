package _02100

fun main() = with(System.`in`.bufferedReader()) {
    val (n, c) = readLine().split(' ').map(String::toInt)
    val houses = IntArray(n) { readLine().toInt() }.sortedArray()
    var start = 1
    var end = houses[n - 1] - houses[0]
    while (start <= end) {
        val mid = (start + end) / 2
        var current = houses[0]
        var count = 1
        for (i in 1 until n) {
            if (houses[i] >= current + mid) {
                current = houses[i]
                count++
            }
        }
        if (count >= c) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    println(start - 1)
}
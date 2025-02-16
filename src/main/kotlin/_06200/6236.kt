package _06200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var left = 0
    var right = 0
    val money = IntArray(n) { readLine().toInt().also { left = maxOf(left, it); right += it } }
    var mid = 0
    while (left <= right) {
        mid = (left + right) / 2
        var withdrawal = mid
        var count = 1
        for (item in money) {
            withdrawal -= item
            if (withdrawal <= 0) {
                count++
                withdrawal = mid - item
            }
        }
        if (count <= m) right = mid - 1
        else left = mid + 1
    }
    println(mid)
}
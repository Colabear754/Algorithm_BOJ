package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val jewels = IntArray(m) { readLine().toInt() }.apply { sort() }
    var left = 1
    var right = jewels.last()
    var result = 0
    while (left <= right) {
        val mid = (left + right) / 2
        var envy = 0
        for (jewel in jewels) {
            envy += (jewel + mid - 1) / mid
        }
        if (envy > n) {
            left = mid + 1
            continue
        }
        result = mid
        right = mid - 1
    }
    println(result)
}
package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val (s, c) = readLine().split(' ').map { it.toInt() }
    val scallions = LongArray(s) { readLine().toLong() }
    var start = 0L
    var end = scallions.max()
    var max = 0L
    while (start <= end) {
        var count = 0L
        val mid = (start + end) / 2
        for (S in scallions) {
            if (S >= mid) count += if (mid != 0L) S / mid else S / 1
        }
        if (count >= c) {
            max = mid
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    println(scallions.sum() - max * c)
}
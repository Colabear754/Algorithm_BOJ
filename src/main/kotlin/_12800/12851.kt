package _12800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    if (n == k) {
        println("0\n1")
        return@with
    }
    val queue = ArrayDeque<Int>().apply { add(n) }
    val time = IntArray(100001).apply { set(n, 1) }
    var count = 0
    var minTime = 1000000000
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        if (time[current] > minTime) break
        val nextPositions = intArrayOf(current - 1, current + 1, current * 2)
        for (next in nextPositions) {
            if (next !in 0..100000) continue
            if (next == k) {
                minTime = time[current]
                count++
            }
            if (time[next] == 0 || time[next] == time[current] + 1) {
                time[next] = time[current] + 1
                queue.add(next)
            }
        }
    }
    println(minTime)
    println(count)
}
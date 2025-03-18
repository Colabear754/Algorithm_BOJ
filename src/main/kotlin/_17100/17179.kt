package _17100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, l) = readLine().split(' ').map { it.toInt() }
    val cuttingPoints = IntArray(m) { readLine().toInt() } + intArrayOf(l)
    repeat(n) {
        val q = readLine().toInt()
        var left = 0
        var right = l
        var count: Int
        var currentPoint: Int
        var result = 0
        while (left <= right) {
            val mid = (left + right) / 2
            count = 0
            currentPoint = 0
            for (i in cuttingPoints.indices) {
                if (cuttingPoints[i] - currentPoint >= mid) {
                    count++
                    currentPoint = cuttingPoints[i]
                }
            }
            if (count > q) result = maxOf(result, mid).also { left = mid + 1 }
            else right = mid - 1
        }
        bw.write("$result")
        bw.newLine()
    }
    bw.close()
}
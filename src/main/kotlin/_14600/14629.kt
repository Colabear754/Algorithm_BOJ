package _14600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var answer = -1L
    var minDiff = Long.MAX_VALUE
    fun dfs(num: Long, used: Int) {
        if (used != 0) {
            val diff = kotlin.math.abs(num - n)
            if (diff < minDiff || (diff == minDiff && num < answer)) {
                minDiff = diff
                answer = num
            }
        }
        if (used == 0b1111111111) return
        for (d in 0..9) {
            if (used and (1 shl d) == 0) {
                if (num == 0L && d == 0) continue
                dfs(num * 10 + d, used or (1 shl d))
            }
        }
    }
    dfs(0, 0)
    println(answer)
}
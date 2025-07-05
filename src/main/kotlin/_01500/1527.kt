package _01500

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toLong() }
    var count = 0
    fun dfs(num: Long) {
        if (num > b) return
        if (num >= a) count++
        dfs(num * 10L + 4L)
        dfs(num * 10L + 7L)
    }
    dfs(0L)
    println(count)
}
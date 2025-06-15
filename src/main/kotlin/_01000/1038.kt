package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n > 1022) return@with println(-1)
    val list = mutableListOf<Long>()
    fun dfs(num: Long, last: Long) {
        list.add(num)
        for (i in 0L..<last) {
            dfs(num * 10 + i, i)
        }
    }
    for (i in 0L..9L) dfs(i, i)
    list.sort()
    println(list[n])
}
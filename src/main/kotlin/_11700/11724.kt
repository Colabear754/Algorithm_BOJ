package _11700

private val graph = Array(1001) { ArrayList<Int>() }
private val visited = BooleanArray(1001)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var result = 0
    repeat(m) {
        readLine().split(' ').map { it.toInt() }.let {
            graph[it[0]].add(it[1])
            graph[it[1]].add(it[0])
        }
    }
    repeat(n) {
        if (!visited[it + 1]) {
            dfs(it + 1)
            result++
        }
    }
    println(result)
}

private fun dfs(cur: Int) {
    for (n in graph[cur]) {
        if (!visited[n]) {
            visited[n] = true
            dfs(n)
        }
    }
}
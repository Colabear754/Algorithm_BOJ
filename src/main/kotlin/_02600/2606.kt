package _02600

private val com = readln().toInt()
private val network = Array(com + 1) { BooleanArray(com + 1) }
private val virus = BooleanArray(com + 1)

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        readLine().split(' ').map { it.toInt() }.let {
            network[it[0]][it[1]] = true
            network[it[1]][it[0]] = true
        }
    }
    dfs(1)

    println(virus.count { it } - 1)
}

private fun dfs(cur: Int) {
    if (virus[cur]) return
    virus[cur] = true
    for (i in 1..com) {
        if (network[cur][i]) dfs(i)
    }
}
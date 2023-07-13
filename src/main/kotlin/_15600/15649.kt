package _15600

fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = readln().split(' ').map(String::toInt)
    val arr = IntArray(m)
    val visited = BooleanArray(n + 1)
    fun dfs(depth: Int) {
        if (depth == m) {
            write("${arr.joinToString(" ")}\n")
            return
        }
        for (i in 1..n) {
            if (!visited[i]) {
                visited[i] = true
                arr[depth] = i
                dfs(depth + 1)
                visited[i] = false
            }
        }
    }
    dfs(0)
    close()
}
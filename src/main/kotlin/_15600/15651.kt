package _15600

fun main() = with(System.out.bufferedWriter()) {
    val (n, m) = readln().split(' ').map(String::toInt)
    val arr = IntArray(m)
    fun dfs(depth: Int) {
        if (depth == m) {
            write("${arr.joinToString(" ")}\n")
            return
        }
        for (i in 1..n) {
            arr[depth] = i
            dfs(depth + 1)
        }
    }
    dfs(0)
    close()
}
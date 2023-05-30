package _15600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = IntArray(m)
    fun dfs(start: Int, depth: Int) {
        if (depth == m) {
            bw.write("${arr.joinToString(" ")}\n")
            return
        }
        for (i in start..n) {
            arr[depth] = i
            dfs(i, depth + 1)
        }
    }
    dfs(1, 0)
    bw.close()
}
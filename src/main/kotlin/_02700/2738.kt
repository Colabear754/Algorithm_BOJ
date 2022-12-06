package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val arr = Array(n) { readLine().split(' ').map { it.toInt() } }
    repeat(n) { i ->
        val tmp = readLine().split(' ').map { it.toInt() }
        repeat(m) { j ->
            bw.write("${arr[i][j] + tmp[j]} ")
        }
        bw.write("\n")
    }
    bw.close()
}
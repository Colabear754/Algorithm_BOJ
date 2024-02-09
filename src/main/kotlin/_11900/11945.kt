package _11900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    repeat(n) { bw.write("${readLine().reversed()}\n") }
    bw.close()
}
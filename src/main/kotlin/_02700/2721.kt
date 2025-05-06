package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toLong()
        bw.write("${n * (n + 1) / 2 * (n + 2) * (n + 3) / 4}")
        bw.newLine()
    }
    bw.close()
}
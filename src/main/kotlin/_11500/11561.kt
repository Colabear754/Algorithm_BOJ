package _11500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toLong()
        bw.write("${((-1.0 + kotlin.math.sqrt(1.0 + 8.0 * n)) / 2.0).toInt()}")
        bw.newLine()
    }
    bw.close()
}
package _33400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.appendLine(readLine().toLong().let { "${it + 2 * (it / 2)}" })
    }
    bw.close()
}
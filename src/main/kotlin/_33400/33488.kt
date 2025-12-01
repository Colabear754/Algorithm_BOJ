package _33400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { bw.appendLine("YES").appendLine((1..readLine().toInt()).joinToString(" ")) }
    bw.close()
}
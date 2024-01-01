package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { bw.write("${readLine().toSet().size}\n") }
    bw.close()
}
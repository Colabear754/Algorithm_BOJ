package _15600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    IntArray(readLine().toInt()) { readLine().toInt() }.sortedArray().forEach { bw.write("$it\n") }
    bw.close()
}
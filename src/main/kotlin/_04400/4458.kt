package _04400

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        readLine().apply { bw.write("${get(0).uppercase()}${drop(1)}\n") }
    }
    bw.close()
}
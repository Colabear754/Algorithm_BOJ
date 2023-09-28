package _12600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { i ->
        readLine().split(' ').reversed().also { bw.write("Case #${i + 1}: ${it.joinToString(" ")}\n") }
    }
    bw.close()
}
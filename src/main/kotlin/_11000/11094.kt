package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { readLine().apply { if (startsWith("Simon says")) bw.write("${substring(10)}\n") } }
    bw.close()
}
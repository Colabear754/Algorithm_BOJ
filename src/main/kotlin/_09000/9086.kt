package _09000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${readLine().let { "${it.first()}${it.last()}" }}\n")
    }
    bw.close()
}
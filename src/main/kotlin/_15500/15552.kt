package _15500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${readLine().split(' ').map { it.toInt() }.let { it[0] + it[1] }}\n")
    }
    bw.close()
}
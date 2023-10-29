package _10500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { bw.write(readLine().split(' ').map { it.toInt() }.let { (v, e) -> "${e - v + 2}\n" }) }
    bw.close()
}
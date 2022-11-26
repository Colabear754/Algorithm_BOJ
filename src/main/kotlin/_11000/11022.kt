package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("Case #${it + 1}: ${readLine().let { n -> "${n[0]} + ${n[2]} = ${n.sumOf { c -> c.code } - 128}" }}\n")
    }
    bw.close()
}
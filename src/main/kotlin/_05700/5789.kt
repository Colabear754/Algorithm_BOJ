package _05700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val s = readLine()
        val mid = s.length / 2
        bw.write(if (s[mid - 1] == s[mid]) "Do-it\n" else "Do-it-Not\n")
    }
    bw.close()
}
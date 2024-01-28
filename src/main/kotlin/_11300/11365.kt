package _11300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var line: String
    while (readLine().also { line = it } != "END") bw.write("${line.reversed()}\n")
    bw.close()
}
package _23300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    bw.write("? 1\n")
    bw.flush()
    val start = readLine().toInt()
    bw.write("? $n\n")
    bw.flush()
    val end = readLine().toInt()
    bw.write(when {
        start > end -> "! -1"
        start < end -> "! 1"
        else -> "! 0"
    })
    bw.close()
}
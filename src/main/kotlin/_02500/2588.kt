package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val a = readLine().toInt()
    val b = readLine()
    bw.write("${a * (b[2] - '0')}\n${a * (b[1] - '0')}\n${a * (b[0] - '0')}\n${a * b.toInt()}")
    bw.close()
}
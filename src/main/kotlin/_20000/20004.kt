package _20000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val a = readLine().toInt()
    for (i in 2..a + 1) {
        if (30 % i == 0) bw.appendLine("${i - 1}")
    }
    bw.close()
}
package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toLong()
        var result = 1L
        for (i in 1..9) result *= (n + i)
        bw.appendLine("${result / 362880}")
    }
    bw.close()
}
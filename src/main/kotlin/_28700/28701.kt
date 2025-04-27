package _28700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val sum = n * (n + 1) / 2
    bw.write("$sum\n")
    bw.write("${sum * sum}\n".repeat(2))
    bw.close()
}
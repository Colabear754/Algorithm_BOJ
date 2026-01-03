package _27500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var sum = 0L
    repeat(readLine().toInt()) {
        sum += readLine().toLong()
        bw.appendLine("${sum.takeHighestOneBit()}")
    }
    bw.close()
}
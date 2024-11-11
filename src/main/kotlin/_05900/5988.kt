package _05900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine()
        bw.write(if ((n.last() - '0') and 1 == 1) "odd\n" else "even\n")
    }
    bw.close()
}
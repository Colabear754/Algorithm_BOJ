package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write(if (readLine().toInt().countOneBits() == 1) "1\n" else "0\n")
    }
    bw.close()
}
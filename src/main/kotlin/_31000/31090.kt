package _31000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) { bw.write(readLine().toInt().let { if((it + 1) % (it % 100) == 0) "Good\n" else "Bye\n" }) }
    bw.close()
}
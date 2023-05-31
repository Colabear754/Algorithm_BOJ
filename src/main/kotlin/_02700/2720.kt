package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val coin = intArrayOf(25, 10, 5, 1)
    repeat(readLine().toInt()) {
        var c = readLine().toInt()
        for (n in coin) {
            bw.write("${c / n} ")
            c %= n
        }
        bw.newLine()
    }
    bw.close()
}
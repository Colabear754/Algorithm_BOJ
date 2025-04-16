package _04700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var prev = readLine().toDouble()
    while (true) {
        val current = readLine().toDouble()
        if (current == 999.0) break
        bw.write("%.2f".format(current - prev))
        bw.newLine()
        prev = current
    }
    bw.close()
}
package _14500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m, a) = readLine().split(' ').map { it.toInt() }
    var current = a
    var tofu: Int
    while (readLine().toInt().also { tofu = it } != m / 2 + 1) {
        current += tofu - (m / 2 + 1) + n
        current %= n
        if (current == 0) current = n
        bw.write("$current")
        bw.newLine()
    }
    bw.write("0")
    bw.close()
}
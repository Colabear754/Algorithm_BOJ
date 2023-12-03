package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    for (i in 1..<2 * n) {
        if (i <= n) bw.write("${" ".repeat(n - i)}${"*".repeat(i)}\n")
        else bw.write("${" ".repeat(i - n)}${"*".repeat(2 * n - i)}\n")
    }
    bw.close()
}
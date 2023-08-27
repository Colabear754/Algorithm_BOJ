package _02200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    while (true) {
        val n = readLine().toInt()
        if (n == 0) break
        val words = Array(n) { readLine() }.sortedBy { it.lowercase() }
        bw.write("${words[0]}\n")
    }
    bw.close()
}
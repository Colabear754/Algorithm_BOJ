package _01100

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val strings = Array(n) { readLine() }.distinct().sorted().sortedWith(compareBy { it.length })
    for (s in strings) {
        bw.write("$s\n")
    }
    bw.close()
}
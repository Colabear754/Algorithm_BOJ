package _10000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (a, b) = readLine().split(' ').map { it.toLong() }
    val min = minOf(a, b)
    val max = maxOf(a, b)
    bw.write("${if (min == max) 0 else max - min - 1}")
    bw.newLine()
    for (i in (min + 1)..<max) {
        bw.write("$i ")
    }
    bw.close()
}
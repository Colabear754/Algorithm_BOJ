package _11700

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        var count = 0
        for (i in a..b) {
            count += i.toString().count { it == '0' }
        }
        bw.write("$count\n")
    }
    bw.close()
}
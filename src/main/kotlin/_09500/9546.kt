package _09500

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        var count = 0
        repeat(n) { count = count * 2 + 1 }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
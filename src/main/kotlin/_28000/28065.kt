package _28000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    var current = 0
    for (i in 0..<n) {
        if (i and 1 == 1) current -= n - i
        else current += n - i
        bw.write("$current ")
    }
    bw.close()
}
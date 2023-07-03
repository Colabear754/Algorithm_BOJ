package _04100

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val times = readLine().toInt()
    repeat(times) {
        var n = readLine().toLong()
        while (true) {
            if (n.isPrime()) {
                bw.write("$n\n")
                break
            }
            n++
        }
    }
    bw.close()
}

private fun Long.isPrime(): Boolean {
    if (this == 0L || this == 1L) return false
    val sqrt = sqrt(this.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (this % i == 0L) return false
    }
    return true
}
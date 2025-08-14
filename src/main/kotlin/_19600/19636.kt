package _19600

import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (w0, i0, t) = readLine().split(' ').map { it.toInt() }
    val (d, i, a) = readLine().split(' ').map { it.toInt() }
    val result1 = w0 - (i0 + a - i) * d
    bw.write(if (result1 <= 0) "Danger Diet\n" else "$result1 $i0\n")
    var currentBase = i0
    var weight = w0
    repeat(d) {
        val consume = i - currentBase - a
        weight += consume
        if (abs(consume) > t) currentBase += (consume / 2).let { if (consume < 0 && consume and 1 != 0) it -1 else it }
        if (weight <= 0 || currentBase <= 0) {
            bw.write("Danger Diet")
            return@with bw.close()
        }
    }
    bw.write("$weight $currentBase ")
    bw.write(if (i0 > currentBase) "YOYO" else "NO")
    bw.close()
}
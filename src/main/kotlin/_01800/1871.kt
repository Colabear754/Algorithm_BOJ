package _01800

import kotlin.math.abs
import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    repeat(n) {
        val car = readLine()
        val prev = car.substring(0, 3)
        val last = car.substring(4).toInt()
        var pValue = 0
        for (i in 0..2) {
            pValue += (prev[i] - 'A') * 26.0.pow(2 - i).toInt()
        }
        bw.write(if (abs(pValue - last) <= 100) "nice\n" else "not nice\n")
    }
    bw.flush()
    bw.close()
}
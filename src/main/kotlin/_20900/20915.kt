package _20900

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().map { if (it == '6') 9L else (it - '0').toLong() }
        val zero = 10.0.pow(n.count { it == 0L }).toLong()
        val exceptZero = n.filter { it != 0L }.sortedDescending()
        if (exceptZero.size < 2) {
            bw.write("0\n")
            return@repeat
        }
        var num1 = 0L
        var num2 = 0L
        for (num in exceptZero) {
            if (num1 > num2) num2 = num2 * 10 + num
            else num1 = num1 * 10 + num
        }
        bw.write("${num1 * num2 * zero}\n")
    }
    bw.close()
}
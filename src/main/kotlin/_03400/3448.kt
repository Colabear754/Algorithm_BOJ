package _03400

import kotlin.math.round

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var str: String
        var length = 0
        var efficiency = 0.0
        while (!readLine().also { str = it }.isNullOrEmpty()) {
            length += str.length
            efficiency += str.count { it != '#' }
        }
        val result = round(efficiency * 1000 / length) / 10
        bw.write("Efficiency ratio is ${if (result - result.toInt() > 0) result else result.toInt()}%.\n")
    }
    bw.close()
}
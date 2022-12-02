package _02100

import kotlin.math.roundToInt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val numbers = IntArray(readLine().toInt())
    val cnt = IntArray(8001)
    var n: Int
    var avg = 0.0
    for (i in numbers.indices) {
        numbers[i] = readLine().toInt().also { n = it }
        cnt[n + 4000]++
        avg += n
    }
    if (cnt.count { it == cnt.maxOrNull() } >= 2) cnt[cnt.indexOf(cnt.maxOrNull()!!)]--
    numbers.sort()
    bw.write("${(avg / numbers.size).roundToInt()}\n")
    bw.write("${numbers[numbers.size / 2]}\n")
    bw.write("${cnt.indexOf(cnt.maxOrNull()!!) - 4000}\n")
    bw.write("${numbers.last() - numbers[0]}")
    bw.close()
}
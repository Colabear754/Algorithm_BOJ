package _02100

import kotlin.math.roundToInt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val numbers = IntArray(readLine().toInt()) { readLine().toInt() }.sortedArray()
    val cnt = IntArray(8001)
    for (n in numbers) cnt[n + 4000]++
    if (cnt.count { it == cnt.maxOrNull() } >= 2) cnt[cnt.indexOf(cnt.maxOrNull()!!)]--
    bw.write("${(numbers.sum().toDouble() / numbers.size).roundToInt()}\n")
    bw.write("${numbers[numbers.size / 2]}\n")
    bw.write("${cnt.indexOf(cnt.maxOrNull()!!) - 4000}\n")
    bw.write("${numbers.last() - numbers[0]}")
    bw.close()
}
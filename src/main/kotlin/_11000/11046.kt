package _11000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val input = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val numbers = IntArray(2 * n - 1) { if (it % 2 == 0) input[it / 2] else -1 }
    val manachers = IntArray(numbers.size)
    var r = -1
    var p = -1
    for (i in numbers.indices) {
        if (i <= r) manachers[i] = minOf(manachers[2 * p - i], r - i)
        while (i - manachers[i] - 1 >= 0 && i + manachers[i] + 1 < numbers.size && numbers[i - manachers[i] - 1] == numbers[i + manachers[i] + 1]) {
            manachers[i]++
        }
        if (r < i + manachers[i]) {
            r = i + manachers[i]
            p = i
        }
    }
    repeat(readLine().toInt()) {
        val (s, e) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        bw.write(if (manachers[s + e - 2] >= e - s) "1\n" else "0\n")
    }
    bw.close()
}
package _17100

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = ArrayList<Int>()
    var max = 0
    repeat(readLine().toInt()) {
        cases.add(readLine().toInt().also { max = maxOf(max, it) })
    }

    val isPrime = BooleanArray(max + 1)
    isPrime[0] = true
    isPrime[1] = true
    val sqrt = sqrt(max.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (!isPrime[i]) {
            for (j in i * i..max step i)
                isPrime[j] = true
        }
    }

    for (t in cases) {
        var count = 0
        for (i in t / 2..t - 2) {
            if (!isPrime[i] && !isPrime[t - i]) {
                count++
            }
        }
        bw.write("${count}\n")
    }
    bw.close()
}
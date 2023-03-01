package _06500

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = ArrayList<Int>()
    var max = 0
    var n: Int
    while (readLine().also { n = it.toInt() } != "0") {
        cases.add(n.also { max = maxOf(max, it) })
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

    loop@ for (t in cases) {
        for (i in 2..t / 2) {
            if (!isPrime[i] && !isPrime[t - i]) {
                bw.write("$t = $i + ${t - i}\n")
                continue@loop
            }
        }
        bw.write("Goldbach's conjecture is wrong.")
    }
    bw.close()
}
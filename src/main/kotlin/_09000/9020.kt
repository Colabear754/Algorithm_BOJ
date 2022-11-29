package _09000

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = ArrayList<Int>()

    repeat(readLine().toInt()) {
        cases.add(readLine().toInt())
    }

    val max = cases.maxOrNull()!!
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
        for (i in t / 2..t) {
            if (!isPrime[i] && !isPrime[t - i]) {
                bw.write("${t - i} $i\n")
                break
            }
        }
    }
    bw.close()
}
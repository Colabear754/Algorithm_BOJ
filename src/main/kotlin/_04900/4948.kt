package _04900

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cases = ArrayList<Int>()
    while (readLine().also { cases.add(it.toInt()) } != "0") {}
    cases.remove(0)
    val max = 123456 * 2
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
        bw.write("${isPrime.slice(t + 1..2 * t).count { !it }}\n")
    }
    bw.close()
}
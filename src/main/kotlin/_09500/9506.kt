package _09500

import java.util.TreeSet
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var n: Int
    while (readLine().also { n = it.toInt() } != "-1") {
        val divisors = TreeSet<Int>().apply { add(1) }
        val sqrt = sqrt(n.toDouble()).toInt()
        for (i in 2..sqrt) {
            if (n % i == 0) {
                divisors.add(i)
                divisors.add(n / i)
            }
        }
        bw.write(if (divisors.sum() == n) "$n = ${divisors.joinToString(" + ")}\n" else "$n is NOT perfect.\n")
    }
    bw.close()
}
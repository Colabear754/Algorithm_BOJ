package _16500

import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    var max = 0
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt().also { max = maxOf(max, it) } } }
    val primes = IntArray(max + 1) { it }
    val sqrt = sqrt(max.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (primes[i] == i) {
            for (j in i * i..max step i)
                if (primes[j] == j) primes[j] = i
        }
    }
    for (num in arr) {
        var temp = num
        while (temp != 1) {
            bw.write("${primes[temp]} ")
            temp /= primes[temp]
        }
        bw.newLine()
    }
    bw.close()
}
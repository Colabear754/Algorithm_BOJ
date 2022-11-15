package _01800

import java.math.BigInteger
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val p = st.nextToken().toBigInteger()
    val k = st.nextToken().toInt()
    val isPrime = BooleanArray(k) { true }
    val prime = ArrayList<Int>()
    var a = 2
    while (a * a < k) {
        for (j in a * a until k step a) {
            isPrime[j] = false
        }
        a++
    }
    for (i in 2 until k) {
        if (isPrime[i]) prime.add(i)
    }
    for (i in prime.indices) {
        if (p.mod(prime[i].toBigInteger()).compareTo(BigInteger.ZERO) == 0) {
            println("BAD ${prime[i]}")
            return@with
        }
    }
    println("GOOD")
}
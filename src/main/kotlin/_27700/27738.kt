package _27700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val st = StringTokenizer(readLine())
    val (a, b, c) = IntArray(3) { st.nextToken().toInt() }
    val (d, e, f) = IntArray(3) { st.nextToken().toInt() }
    var x = 0L
    for (i in n - n % f + 1..n) {
        if (i % a == 0L) x += i
        if (i % b == 0L) x %= i
        if (i % c == 0L) x = x and i
        if (i % d == 0L) x = x xor i
        if (i % e == 0L) x = x or i
    }
    println(x)
}
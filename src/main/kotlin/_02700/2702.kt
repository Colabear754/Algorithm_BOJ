package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        val gcd = gcd(a, b)
        bw.write("${a * b / gcd} $gcd\n")
    }
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (a % b == 0) b else gcd(b, a % b)
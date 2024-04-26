package _09600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val arr = StringTokenizer(readLine()).run { IntArray(nextToken().toInt()) { nextToken().toInt() } }
        var sum = 0L
        for (i in 0..<arr.lastIndex) {
            for (j in i + 1..<arr.size) {
                sum += gcd(arr[i], arr[j])
            }
        }
        bw.write("$sum")
        bw.newLine()
    }
    bw.close()
}

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
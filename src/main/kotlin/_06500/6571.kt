package _06500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val fibonacci = Array(481) { (-1).toBigInteger() }
    fibonacci[1] = 1.toBigInteger()
    fibonacci[2] = 2.toBigInteger()
    for (i in 3..480) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
    lateinit var input: String
    while (readLine().also { input = it } != "0 0") {
        val (a, b) = StringTokenizer(input).run { nextToken().toBigInteger() to nextToken().toBigInteger() }
        var count = 0
        for (n in fibonacci) {
            if (n in a..b) count++
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
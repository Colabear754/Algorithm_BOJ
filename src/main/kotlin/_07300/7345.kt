package _07300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val polynomials = List(3) { StringTokenizer(readLine()).run { IntArray(nextToken().toInt()) { nextToken().toInt() } } }
        val multinomial = IntArray(polynomials[0].size + polynomials[1].size - 1)
        for (i in polynomials[0].indices) {
            for (j in polynomials[1].indices) {
                multinomial[i + j] = multinomial[i + j] xor (polynomials[0][i] and polynomials[1][j])
            }
        }
        val dividend = ArrayDeque(multinomial.toList())
        val hSize = polynomials[2].size
        while (dividend.size >= hSize) {
            val dividendSize = dividend.size
            val shift = dividendSize - hSize
            for (i in polynomials[2].indices) {
                val currentIndex = dividendSize - shift - hSize + i
                dividend[currentIndex] = dividend[currentIndex] xor polynomials[2][i]
            }
            while (dividend.isNotEmpty() && dividend.first() == 0) {
                dividend.removeFirst()
            }
        }
        bw.write("${dividend.size} ${dividend.joinToString(" ")}\n")
    }
    bw.close()
}
package _13100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val (price, money, f, c) = IntArray(4) { nextToken().toInt() }
            val chicken = money / price
            val coupon = chicken * c
            val dooyoung = chicken + coupon / f
            val sangun = chicken + if (coupon >= f) 1 + (coupon - f) / (f - c) else 0
            bw.write("${sangun - dooyoung}")
            bw.newLine()
        }
    }
    bw.close()
}
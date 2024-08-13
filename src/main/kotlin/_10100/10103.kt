package _10100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var changyoung = 100
    var sangduk = 100
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { nextToken().toInt() to nextToken().toInt() }
        when {
            a > b -> sangduk -= a
            a < b -> changyoung -= b
        }
    }
    println("$changyoung\n$sangduk")
}
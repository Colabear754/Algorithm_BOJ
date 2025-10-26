package _17900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val stocks = IntArray(n)
    StringTokenizer(readLine()).apply { for (i in 1..n) { stocks[n - i] = nextToken().toInt() } }
    var maxPrice = 0
    var result = 0
    for (price in stocks) {
        if (price > maxPrice) {
            maxPrice = price
            continue
        }
        result += maxPrice - price
    }
    println(result)
}
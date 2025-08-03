package _29700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0
    var price = 0
    repeat(n) {
        StringTokenizer(readLine()).run {
            when (nextToken()) {
                "A" -> {
                    val apple = (nextToken().toInt() / 12) * (nextToken().toInt() / 12) * (nextToken().toInt() / 12)
                    sum += 1000 + apple * 500
                    price += apple * 4000
                }
                "B" -> sum += 6000
            }
        }
    }
    println("$sum\n$price")
}
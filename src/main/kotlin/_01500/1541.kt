package _01500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val numbers = StringTokenizer(str, "+-")
    val operators = StringTokenizer(str, "0123456789")
    var sum = numbers.nextToken().toInt()
    var checkSub = false
    while (numbers.hasMoreTokens()) {
        if (!checkSub && operators.nextToken() == "-") checkSub = true

        if (checkSub) sum -= numbers.nextToken().toInt()
        else sum += numbers.nextToken().toInt()
    }
    println(sum)
}
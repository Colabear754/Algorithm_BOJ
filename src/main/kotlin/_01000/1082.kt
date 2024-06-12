package _01000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var minWithoutZero = 0 to 50
    var min = 0 to 50
    val prices = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt().apply {
        if (it != 0 && this <= minWithoutZero.second) minWithoutZero = it to this
        if (this <= min.second) min = it to this
    } } }
    var money = readLine().toInt()
    if (minWithoutZero.second > money) {
        println(0)
        return@with
    }
    money -= minWithoutZero.second
    val length = money / min.second + 1
    money %= min.second
    val result = IntArray(length) { min.first }.also { it[0] = minWithoutZero.first }
    for (i in 0..<length) {
        for (j in n - 1 downTo result[i] + 1) {
            if (prices[j] - prices[result[i]] <= money) {
                money -= prices[j] - prices[result[i]]
                result[i] = j
                break
            }
        }
    }
    println(result.joinToString(""))
}
package _01100

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val target = readLine().toInt()
    val n = readLine().toInt()
    val isBroken = BooleanArray(10)
    if (n != 0) {
        StringTokenizer(readLine()).apply {
            repeat(n) { isBroken[nextToken().toInt()] = true }
        }
    }
    if (target == 100) {
        println(0)
        return@with
    }
    var min = abs(100 - target)
    for (i in 0..1000001) {
        if (isAble(isBroken, i)) min = minOf(min, abs(i - target) + i.length())
    }
    println(min)
}

fun Int.length(): Int {
    var result = 1
    var arg = this
    while (arg / 10 > 0) {
        arg /= 10
        result++
    }

    return result
}

fun isAble(arr: BooleanArray, num: Int): Boolean {
    var arg = num
    var length = num.length()
    while (length-- > 0) {
        if (arr[arg % 10]) return false
        arg /= 10
    }
    return true
}
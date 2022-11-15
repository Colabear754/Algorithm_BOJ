package _01800

import kotlin.math.pow

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var s: String
    while (readLine().also { s = it } != "#") {
        var result = 0
        for (i in s.indices) {
            result += getNum(s[i]) * (8.0).pow(s.lastIndex - i).toInt()
        }
        bw.write("${result}\n")
    }
    bw.flush()
    bw.close()
}

fun getNum(c: Char) = when (c) {
    '-' -> 0
    '\\' -> 1
    '(' -> 2
    '@' -> 3
    '?' -> 4
    '>' -> 5
    '&' -> 6
    '%' -> 7
    else -> -1
}
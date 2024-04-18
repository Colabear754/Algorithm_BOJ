package _20100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var bit = 0
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt().also { bit = bit xor it } } }
    var max = bit
    arr.forEach { max = maxOf(max, bit xor it) }
    println("$max$max")
}

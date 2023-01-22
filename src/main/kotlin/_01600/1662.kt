package _01600

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val normal = Stack<Int>()
    val multiply = Stack<Int>()
    var count = 0
    val compressed = readLine()
    for (i in compressed.indices) {
        when (compressed[i]) {
            '(' -> {
                normal.push(count - 1)
                multiply.push(compressed[i - 1] - '0')
                count = 0
            }
            ')' -> count = normal.pop() + multiply.pop() * count
            else -> count++
        }
    }
    println(count)
}
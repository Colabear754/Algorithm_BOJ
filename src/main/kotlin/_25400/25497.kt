package _25400

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val combo1 = Stack<Char>()
    val combo2 = Stack<Char>()
    readLine()
    val skill = readLine()
    var count = 0
    for (c in skill) {
        when (c) {
            'L' -> combo1.push(c)
            'R' -> if (combo1.isEmpty()) break else {
                combo1.pop()
                count++
            }
            'S' -> combo2.push(c)
            'K' -> if (combo2.isEmpty()) break else {
                combo2.pop()
                count++
            }
            else -> count++
        }
    }
    println(count)
}
package _10700

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Int>()
    var n:Int
    repeat(readLine().toInt()) {
        n = readLine().toInt()
        when (n) {
            0 -> stack.pop()
            else -> stack.push(n)
        }
    }
    println(stack.sum())
}
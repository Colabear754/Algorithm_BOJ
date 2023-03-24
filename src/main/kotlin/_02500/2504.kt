package _02500

import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val stack = LinkedList<Char>()
    var result = 0
    var value = 1
    for (i in str.indices) {
        when (str[i]) {
            '(' -> {
                stack.push(str[i])
                value *= 2
            }
            '[' -> {
                stack.push(str[i])
                value *= 3
            }
            ')' -> {
                if (stack.isEmpty() || stack.peek() != '(') {
                    println(0)
                    return@with
                }
                if (str[i - 1] == '(') result += value
                stack.pop()
                value /= 2
            }
            ']' -> {
                if (stack.isEmpty() || stack.peek() != '[') {
                    println(0)
                    return@with
                }
                if (str[i - 1] == '[') result += value
                stack.pop()
                value /= 3
            }
        }
    }
    println(if (stack.isEmpty()) result else 0)
}
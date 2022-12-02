package _01800

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val stack = Stack<Int>()
    val arr = IntArray(readLine().toInt()) { readLine().toInt() }
    var curr = 1
    for (num in arr) {
        while (curr <= num) {
            stack.push(curr++)
            sb.append("+\n")
        }
        if (stack.peek() == num) {
            stack.pop()
            sb.append("-\n")
        } else {
            println("NO")
            return@with
        }
    }
    println(sb)
}
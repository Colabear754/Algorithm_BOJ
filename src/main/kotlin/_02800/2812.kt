package _02800

import java.util.LinkedList

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val number = readLine()
    val stack = LinkedList<Char>()
    var count = 0
    for (num in number.indices) {
        if (count == k) {
            for (c in number.substring(num)) stack.push(c)
            break
        }
        while (stack.isNotEmpty() && stack.peek() < number[num] && count < k) {
            stack.pop()
            count++
        }
        stack.push(number[num])
    }
    while (count < k) {
        stack.pop()
        count++
    }
    println(stack.joinToString("").reversed())
}
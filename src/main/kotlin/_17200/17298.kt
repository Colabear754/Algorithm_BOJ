package _17200

import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numbers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val nge = IntArray(n)
    val stack = Stack<Int>()
    for (i in n - 1 downTo 0) {
        while (stack.isNotEmpty()) {
            if (numbers[i] >= numbers[stack.peek()]) stack.pop()
            else break
        }
        nge[i] = if (stack.isEmpty()) -1 else numbers[stack.peek()]
        stack.push(i)
    }
    print(nge.joinToString(" "))
}
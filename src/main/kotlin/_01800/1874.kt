package _01800

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val stack = Stack<Int>()
    val arr = IntArray(readLine().toInt()) { readLine().toInt() }
    var curr = 1
    for (num in arr) {
        while (curr <= num) {
            stack.push(curr++)
            bw.write("+\n")
        }
        if (stack.peek() == num) {
            stack.pop()
            bw.write("-\n")
        } else {
            println("NO")
            return@with
        }
    }
    bw.close()
}
package _09900

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    val bomb = readLine()
    val stack = Stack<Char>()
    for (c in str) {
        stack.push(c)
        if (c == bomb.last()) {
            var checkBombString = StringBuilder()
            for (i in bomb.indices) {
                if (stack.isEmpty()) break
                checkBombString.append(stack.pop())
            }
            checkBombString = checkBombString.reverse()
            if (checkBombString.toString() != bomb) {
                repeat(checkBombString.length) { stack.push(checkBombString[it]) }
            }
        }
    }
    println(if (stack.isEmpty()) "FRULA" else stack.joinToString(""))
}
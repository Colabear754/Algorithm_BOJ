package _09000

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val t = readLine().toInt()
    loop@ for (i in 0 until t) {
        val stack = Stack<Char>()
        val str = readLine()
        for (c in str) {
            if (c == '(') {
                stack.push(c)
            } else {
                if (stack.empty()) {
                    bw.write("NO\n")
                    continue@loop
                } else {
                    stack.pop()
                }
            }
        }

        bw.write(if (stack.empty()) "YES\n" else "NO\n")
    }
    bw.close()
}
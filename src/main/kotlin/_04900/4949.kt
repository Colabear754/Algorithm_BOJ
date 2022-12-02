package _04900

import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var str: String
    loop@ while (readLine().also { str = it } != ".") {
        val stack = Stack<Char>()
        for (c in str) {
            when (c) {
                '(', '[' -> stack.push(c)
                ')' -> {
                    if (stack.isNotEmpty() && stack.peek() == '(') stack.pop()
                    else {
                        bw.write("no\n")
                        continue@loop
                    }
                }

                ']' -> {
                    if (stack.isNotEmpty() && stack.peek() == '[') stack.pop()
                    else {
                        bw.write("no\n")
                        continue@loop
                    }
                }
            }
        }

        bw.write(if (stack.empty()) "yes\n" else "no\n")
    }
    bw.close()
}
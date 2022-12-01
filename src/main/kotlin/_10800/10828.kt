package _10800

import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val stack = Stack<Int>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "push" -> stack.add(st.nextToken().toInt())
            "pop" -> bw.write("${if (stack.isEmpty()) -1 else stack.pop()}\n")
            "size" -> bw.write("${stack.size}\n")
            "empty" -> bw.write("${if (stack.isEmpty()) 1 else 0}\n")
            "top" -> bw.write("${if (stack.isEmpty()) -1 else stack.peek()}\n")
        }
    }
    bw.close()
}
package _01900

import java.util.*

fun main() = with(System.out.bufferedWriter()) {
    val priority = HashMap<Char, Byte>().also {
        it['*'] = 1
        it['/'] = 1
        it['('] = -1
        it[')'] = -1
    }
    val expression = readln()
    val operators = Stack<Char>()
    for (c in expression) {
        when (c) {
            in 'A'..'Z' -> write("$c")
            '(' -> operators.push(c)
            ')' -> {
                while (operators.peek() != '(') {
                    write("${operators.pop()}")
                }
                operators.pop()
            }
            else -> {
                while (operators.isNotEmpty() && (priority[operators.peek()] ?: 0) >= (priority[c] ?: 0)) {
                    write("${operators.pop()}")
                }
                operators.push(c)
            }
        }
    }
    while (operators.isNotEmpty()) {
        write("${operators.pop()}")
    }
    close()
}
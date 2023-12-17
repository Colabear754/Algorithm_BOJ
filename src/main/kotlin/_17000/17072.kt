package _17000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    repeat(n) {
        StringTokenizer(readLine()).apply {
            while (hasMoreTokens()) {
                val (r, g, b) = IntArray(3) { nextToken().toInt() }
                val gray = (r * 2126 + g * 7152 + b * 722) / 10000
                sb.append(when {
                    gray >= 204 -> '.'
                    gray >= 153 -> '-'
                    gray >= 102 -> '+'
                    gray >= 51 -> 'o'
                    else -> '#'
                })
            }
        }
        sb.append('\n')
    }
    print(sb)
}
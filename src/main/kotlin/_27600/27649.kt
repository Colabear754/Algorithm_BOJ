package _27600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val command = readLine()
    val parsed = StringBuilder()
    val delimiter1 = setOf('<', '>', '(', ')')
    var i = 0
    while (i < command.lastIndex) {
        if (command[i] == '&' && command[i + 1] == '&') {
            parsed.append(" && ")
            i += 2
            continue
        }
        if (command[i] == '|' && command[i + 1] == '|') {
            parsed.append(" || ")
            i += 2
            continue
        }
        if (command[i] in delimiter1) {
            parsed.append(' ').append(command[i++]).append(' ')
            continue
        }
        parsed.append(command[i++])
    }
    if (command.last() in delimiter1) parsed.append(' ').append(command.last())
    else if (command.last() !in charArrayOf('&', '|')) parsed.append(command.last())
    StringTokenizer(parsed.toString()).run { while (hasMoreTokens()) { sb.append(nextToken()).append(' ') } }
    println(sb)
}
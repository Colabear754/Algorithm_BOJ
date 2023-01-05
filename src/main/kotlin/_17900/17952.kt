package _17900

import java.util.Stack
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val stack = Stack<Project>()
    var score = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "0" -> if (stack.isNotEmpty()) stack.peek().time--
                "1" -> stack.push(Project(nextToken().toInt(), nextToken().toInt() - 1))
            }
        }
        if (stack.isNotEmpty() && stack.peek().time == 0) {
            score += stack.pop().score
        }
    }
    println(score)
}

class Project(val score: Int, var time: Int)
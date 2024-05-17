package _28000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val queue = ArrayDeque<Char>()
    var direction = 0 // 0: right, 1: down, 2: left, 3: up
    var ballCount = 0
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "push" -> {
                    val char = nextToken()[0]
                    if (char == 'w') {
                        queue.addLast(char)
                        return@repeat
                    }
                    when (direction) {
                        1 -> if (queue.firstOrNull() == 'w') {
                            queue.addLast(char)
                            ballCount++
                        }
                        0, 2 -> {
                            queue.addLast(char)
                            ballCount++
                        }
                    }
                }
                "pop" -> {
                    if (queue.isEmpty()) return@repeat
                    if (queue.removeFirst() == 'b') ballCount--
                    if (direction == 1) {
                        while (queue.firstOrNull() == 'b') {
                            queue.removeFirst()
                            ballCount--
                        }
                    }
                }
                "rotate" -> {
                    direction = if (nextToken() == "l") (direction + 3) % 4 else (direction + 1) % 4
                    if (queue.isEmpty()) return@repeat
                    when (direction) {
                        1 -> while (queue.firstOrNull() == 'b') {
                            queue.removeFirst()
                            ballCount--
                        }
                        3 -> while (queue.lastOrNull() == 'b') {
                            queue.removeLast()
                            ballCount--
                        }
                    }
                }
                "count" -> sb.append(if (nextToken() == "b") ballCount else queue.size - ballCount).append('\n')
            }
        }
    }
    println(sb)
}
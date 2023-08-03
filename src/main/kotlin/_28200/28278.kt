package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val deque = ArrayDeque<Int>()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> deque.addLast(nextToken().toInt())
                "2" -> bw.write(if (deque.isNotEmpty()) "${deque.removeLast()}\n" else "-1\n")
                "3" -> bw.write("${deque.size}\n")
                "4" -> bw.write(if (deque.isEmpty()) "1\n" else "0\n")
                "5" -> bw.write(if (deque.isNotEmpty()) "${deque.last()}\n" else "-1\n")
            }
        }
    }
    bw.close()
}
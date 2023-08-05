package _28200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val deque = ArrayDeque<Int>()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> deque.addFirst(nextToken().toInt())
                "2" -> deque.addLast(nextToken().toInt())
                "3" -> bw.write("${deque.removeFirstOrNull() ?: -1}\n")
                "4" -> bw.write("${deque.removeLastOrNull() ?: -1}\n")
                "5" -> bw.write("${deque.size}\n")
                "6" -> bw.write(if (deque.isEmpty()) "1\n" else "0\n")
                "7" -> bw.write("${deque.firstOrNull() ?: -1}\n")
                "8" -> bw.write("${deque.lastOrNull() ?: -1}\n")
            }
        }
    }
    bw.close()
}
package _10800

import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val queue: Queue<Int> = LinkedList()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "push" -> queue.add(st.nextToken().toInt())
            "pop" -> bw.write("${queue.poll() ?: -1}\n")
            "size" -> bw.write("${queue.size}\n")
            "empty" -> bw.write("${if (queue.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${queue.peek() ?: -1}\n")
            "back" -> bw.write("${if (queue.isEmpty()) -1 else queue.last()}\n")
        }
    }
    bw.close()
}
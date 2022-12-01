package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val deque = ArrayDeque<String>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "push_front" -> deque.addFirst(st.nextToken())
            "push_back" -> deque.addLast(st.nextToken())
            "pop_front" -> bw.write("${deque.removeFirstOrNull() ?: -1}\n")
            "pop_back" -> bw.write("${deque.removeLastOrNull() ?: -1}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> bw.write("${if (deque.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${deque.firstOrNull() ?: -1}\n")
            "back" -> bw.write("${deque.lastOrNull() ?: -1}\n")
        }
    }
    bw.close()
}
package _01900

import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val queue: Queue<IntArray> = LinkedList()
        val (n, m) = readLine().split(' ').map { it.toInt() }
        val st = StringTokenizer(readLine())
        repeat(n) {
            queue.add(intArrayOf(it, st.nextToken().toInt()))
        }
        var order = 0
        while (true) {
            if (queue.peek()[1] == queue.maxOf { it[1] }) {
                order++
                if (queue.poll()[0] == m) break
            } else {
                queue.add(queue.poll())
            }
        }
        bw.write("$order\n")
    }
    bw.close()
}
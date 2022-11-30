package _02700

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val queue = PriorityQueue<Int>()
    repeat(readLine().toInt()) {
        queue.add(readLine().toInt())
    }
    repeat(queue.size) {
        bw.write("${queue.poll()}\n")
    }
    bw.close()
}
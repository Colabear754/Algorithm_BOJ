package _01900

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val heap = PriorityQueue<Int>()
    var n: Int
    repeat(readLine().toInt()) {
        when (readLine().toInt().also { n = it }) {
            0 -> bw.write(if (heap.isEmpty()) "0\n" else "${heap.poll()}\n")
            else -> heap.add(n)
        }
    }
    bw.close()
}
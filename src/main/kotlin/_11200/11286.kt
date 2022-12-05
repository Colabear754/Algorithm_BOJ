package _11200

import java.util.PriorityQueue
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val heap = PriorityQueue<Int> { o1, o2 -> if (abs(o1) == abs(o2)) o1 - o2 else abs(o1) - abs(o2) }
    var n: Int
    repeat(readLine().toInt()) {
        when (readLine().toInt().also { n = it }) {
            0 -> bw.write(if (heap.isEmpty()) "0\n" else "${heap.poll()}\n")
            else -> heap.add(n)
        }
    }
    bw.close()
}
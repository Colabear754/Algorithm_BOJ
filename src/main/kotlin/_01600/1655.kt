package _01600

import java.util.PriorityQueue

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val maxHeap = PriorityQueue<Int>(reverseOrder())
    val minHeap = PriorityQueue<Int>()
    repeat(n) {
        val num = readLine().toInt()
        if (maxHeap.size == minHeap.size) maxHeap.add(num)
        else minHeap.add(num)
        if (maxHeap.isNotEmpty() && minHeap.isNotEmpty() && maxHeap.peek() > minHeap.peek()) {
            maxHeap.add(minHeap.poll())
            minHeap.add(maxHeap.poll())
        }
        bw.write("${maxHeap.peek()}\n")
    }
    bw.close()
}
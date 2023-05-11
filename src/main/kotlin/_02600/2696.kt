package _02600

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val maxHeap = PriorityQueue<Int>(reverseOrder())
        val minHeap = PriorityQueue<Int>()
        val m = readLine().toInt()
        bw.write("${m / 2 + m % 2}\n")
        val times = m / 10 + if (m % 10 == 0) 0 else 1
        repeat(times) { i ->
            StringTokenizer(readLine()).run {
                repeat(countTokens()) { j ->
                    val num = nextToken().toInt()
                    if (maxHeap.size == minHeap.size) maxHeap.add(num)
                    else minHeap.add(num)
                    if (maxHeap.isNotEmpty() && minHeap.isNotEmpty() && maxHeap.peek() > minHeap.peek()) {
                        maxHeap.add(minHeap.poll())
                        minHeap.add(maxHeap.poll())
                    }
                    if (j % 2 == 0) bw.write("${maxHeap.peek()} ")
                }
            }
            if (i % 2 == 1 || i == times - 1) bw.newLine()
        }
    }
    bw.close()
}
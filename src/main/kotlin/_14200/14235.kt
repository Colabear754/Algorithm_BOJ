package _14200

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val gifts = PriorityQueue<Int>(reverseOrder())
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).run {
            nextToken().toInt().let { a ->
                if (a == 0) {
                    bw.write("${gifts.poll() ?: -1}")
                    bw.newLine()
                    return@repeat
                }
                repeat(a) { gifts.add(nextToken().toInt()) }
            }
        }
    }
    bw.close()
}
package _13900

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val files = PriorityQueue<Long>()
        val k = readLine().toInt()
        StringTokenizer(readLine()).apply { repeat(k) { files.add(nextToken().toLong()) } }
        var sum = 0L
        while (files.size > 1) sum += (files.poll() + files.poll()).also { files.add(it) }
        bw.write("$sum\n")
    }
    bw.close()
}
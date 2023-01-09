package _21700

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (t, n) = readLine().split(' ').map { it.toInt() }
    val scheduler = PriorityQueue<Process>()
    repeat(n) {
        StringTokenizer(readLine()).apply { scheduler.add(Process(nextToken().toInt(), nextToken().toInt(), nextToken().toInt())) }
    }
    for (i in 1..t) {
        val process = scheduler.poll()?.apply {
            bw.write("$id\n")
            time--
            priority--
        } ?: break

        if (process.time > 0)
            scheduler.add(process)
    }
    bw.close()
}

class Process(val id: Int, var time: Int, var priority: Int) : Comparable<Process> {
    override fun compareTo(other: Process) = if (other.priority == this.priority) this.id - other.id else other.priority - this.priority
}
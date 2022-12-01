package _11600

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val heap = PriorityQueue<Point>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        heap.add(Point(st.nextToken().toInt(), st.nextToken().toInt()))
    }
    repeat(heap.size) {
        bw.write("${heap.poll()}\n")
    }
    bw.close()
}

class Point(var x: Int, var y: Int) : Comparable<Point> {
    override fun compareTo(other: Point) = if (this.x - other.x != 0) this.x - other.x else this.y - other.y
    override fun toString() = "$x $y"
}
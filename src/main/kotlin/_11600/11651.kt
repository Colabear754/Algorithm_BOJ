package _11600

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val heap = PriorityQueue<Coordinate>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        heap.add(Coordinate(st.nextToken().toInt(), st.nextToken().toInt()))
    }
    repeat(heap.size) {
        bw.write("${heap.poll()}\n")
    }
    bw.close()
}

class Coordinate(var x: Int, var y: Int) : Comparable<Coordinate> {
    override fun compareTo(other: Coordinate) = if (this.y == other.y) this.x - other.x else this.y - other.y
    override fun toString() = "$x $y"
}
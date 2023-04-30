package _01700

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val acquiredRamens = PriorityQueue<Int>()
    val problems = Array(readLine().toInt()) { Problem(StringTokenizer(readLine())) }.sortedArray()
    for (problem in problems) {
        acquiredRamens.add(problem.ramens)
        if (problem.deadLine < acquiredRamens.size) {
            acquiredRamens.poll()
        }
    }
    println(acquiredRamens.sum())
}

class Problem(val deadLine: Int, val ramens: Int) : Comparable<Problem> {
    constructor(st: StringTokenizer) : this(st.nextToken().toInt(), st.nextToken().toInt())
    override fun compareTo(other: Problem) = if (this.deadLine == other.deadLine) other.ramens - this.ramens else this.deadLine - other.deadLine
}
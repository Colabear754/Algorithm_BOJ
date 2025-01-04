package _30300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val isSolved = StringTokenizer(readLine()).run { BooleanArray(n) { nextToken().toInt() > 0 } }
    var equipped = true
    var waiting = true
    var count = 0
    var max = 0
    for (solved in isSolved) {
        if (waiting) equipped = true
        waiting = true
        if (solved) {
            max = maxOf(max, ++count)
            continue
        }
        if (equipped) {
            equipped = false
            waiting = false
            continue
        }
        max = maxOf(max, count)
        count = 0
    }
    println(max)
}
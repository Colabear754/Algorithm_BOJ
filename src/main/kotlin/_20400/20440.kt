package _20400

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val mosquito = Array(readLine().toInt()) { StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } } }
        .sortedArrayWith { o1, o2 -> if (o1[0] == o2[0]) o1[1] - o2[1] else o1[0] - o2[0] }
    val exitTime = PriorityQueue<Int>()
    var start = 0
    var end = 0
    var count = 0
    for (i in mosquito.indices) {
        exitTime.add(mosquito[i][1])
        var prev = -1
        while (mosquito[i][0] >= exitTime.peek()) prev = exitTime.poll()
        if (exitTime.size > count) {
            start = mosquito[i][0]
            end = exitTime.peek()
            count = exitTime.size
        }
        if (exitTime.size == count && prev == mosquito[i][0]) end = exitTime.peek()
    }
    println("$count\n$start $end")
}
package _01700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val order = StringTokenizer(readLine()).run { IntArray(k) { nextToken().toInt() } }
    val plug = HashSet<Int>()
    var result = 0
    loop@ for (i in order.indices) {
        if (plug.size < n) {
            plug.add(order[i])
            continue
        }
        if (order[i] !in plug) {
            var latestItem = 0
            val nextOrder = order.sliceArray(i + 1..order.lastIndex)
            for (item in plug) {
                if (item !in nextOrder) {
                    plug.remove(item)
                    plug.add(order[i])
                    result++
                    continue@loop
                }
                latestItem = maxOf(latestItem, nextOrder.indexOf(item))
            }
            plug.remove(nextOrder[latestItem])
            plug.add(order[i])
            result++
        }
    }
    println(result)
}
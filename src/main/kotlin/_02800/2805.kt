package _02800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val trees = IntArray(n) { st.nextToken().toInt() }
    var start = 0
    var end = trees.maxOrNull()
    while (start + 1 < end!!) {
        var wood = 0L
        val h = (start + end) / 2
        for (t in trees) {
            if (t >= h) {
                wood += t - h
            }
        }

        if (wood.toInt() == m) {
            println(h)
            return@with
        }

        if (wood > m) start = h
        else end = h
    }

    println(start)
}
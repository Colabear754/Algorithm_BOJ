package _26500

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    var start = -1000000000000000000L
    var end = 1000000000000000000L
    val q = readLine().toInt()
    var index = 0
    for (i in 1..q) {
        val st = StringTokenizer(readLine())
        val x = st.nextToken().toLong()
        when (st.nextToken()) {
            "^" ->  start = maxOf(start, x + 1)
            "v" ->  end = minOf(end, x - 1)
        }
        if (start == end && index == 0) {
            index = i
        } else if (start > end) {
            println("Paradox!\n$i")
            return@with
        }
    }
    println(if (index == 0) "Hmm..." else "I got it!\n$index")
}
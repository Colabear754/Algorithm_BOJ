package _05400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var p: String
    var arr: String
    var st: StringTokenizer
    loop@ for (i in 1..readLine().toInt()) {
        val deque = ArrayDeque<Int>()
        var isReversed = false
        p = readLine()
        readLine()
        st = StringTokenizer(readLine().also { arr = it }.slice(1 until arr.lastIndex))
        while (st.hasMoreTokens()) deque.add(st.nextToken(",").toInt())
        for (c in p) {
            when (c) {
                'R' -> isReversed = !isReversed
                'D' -> {
                    if (deque.isEmpty()) {
                        bw.write("error\n")
                        continue@loop
                    }
                    if (isReversed) deque.removeLast()
                    else deque.removeFirst()
                }
            }
        }
        if (isReversed) deque.reverse()
        bw.write("[${deque.joinToString(",")}]\n")
    }
    bw.close()
}
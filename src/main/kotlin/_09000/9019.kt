package _09000

import java.util.LinkedList
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (start, goal) = StringTokenizer(readLine()).run { listOf(nextToken().toInt(), nextToken().toInt()) }
        val dslr = IntArray(10000) { 10000 }
        val list = LinkedList<Int>()
        list.add(start)
        dslr[start] = -1
        while (list.isNotEmpty()) {
            var current = list.poll()
            if (current == goal) {
                val tempList = LinkedList<Int>()
                tempList.addFirst(current)
                while (dslr[current] != -1) {
                    current = dslr[current]
                    tempList.addFirst(current)
                }
                var prev = tempList.poll()
                for (n in tempList) {
                    var i = 0
                    while (i++ <= 4) if (calc(i, prev) == n) break
                    bw.write(when (i) {
                        1 -> "D"
                        2 -> "S"
                        3 -> "L"
                        4 -> "R"
                        else -> ""
                    })
                    prev = n
                }
                bw.newLine()
                break
            }
            for (i in 1..4) {
                val next = calc(i, current)
                if (dslr[next] != 10000) continue
                dslr[next] = current
                list.add(next)
            }
        }
    }
    bw.close()
}

private fun calc(i: Int, current: Int) = when (i) {
    1 -> (current * 2) % 10000
    2 -> (current + 9999) % 10000
    3 -> (current % 1000) * 10 + current / 1000
    4 -> current / 10 + (current % 10) * 1000
    else -> -1
}
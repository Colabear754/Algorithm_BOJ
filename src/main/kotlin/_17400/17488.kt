package _17400

import java.util.StringTokenizer
import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val basket = Array(m) { mutableListOf<Int>() }
    var st = StringTokenizer(readLine())
    val classLimit = IntArray(m) { st.nextToken().toInt() }
    val students = Array(n) { TreeSet<Int>() }
    repeat(2) {
        repeat(n) { i ->
            st = StringTokenizer(readLine())
            var temp: Int
            while (st.nextToken().also { temp = it.toInt() - 1 } != "-1") basket[temp].add(i)
        }

        for (i in basket.indices) {
            if (basket[i].size <= classLimit[i]) {
                for (j in basket[i].indices) students[basket[i][j]].add(i + 1)
            }
        }
    }
    for (student in students) {
        bw.write(if (student.isEmpty()) "망했어요\n" else "${student.joinToString(" ")}\n")
    }
    bw.close()
}
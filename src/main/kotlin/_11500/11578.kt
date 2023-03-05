package _11500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var students = IntArray(m + 1)
    for (i in 1..m) {
        val st = StringTokenizer(readLine())
        repeat(st.nextToken().toInt()) {
            students[i] = students[i] or (1 shl st.nextToken().toInt() - 1)
        }
    }
    for (i in 1..m) {
        val set = HashSet<Int>()
        for (j in students.indices) {
            if (students[j] == 2.pow(n) - 1) {
                println(i)
                return@with
            }
            for (k in j + 1..students.lastIndex) {
                set.add(students[j] or students[k])
            }
        }
        students = set.toIntArray()
    }
    println(-1)
}

private fun Int.pow(n: Int): Int {
    var result = 1
    repeat(n) {
        result *= this
    }
    return result
}
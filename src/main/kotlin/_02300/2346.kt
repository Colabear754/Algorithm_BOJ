package _02300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder("1 ")
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    var next = st.nextToken().toInt()
    val ballon = ArrayDeque<IntArray>().apply { repeat(n - 1) { add(intArrayOf(it + 2, st.nextToken().toInt())) } }
    while (ballon.isNotEmpty()) {
        val temp = if (next > 0) {
            repeat(next - 1) { ballon.addLast(ballon.removeFirst()) }
            ballon.removeFirst()
        } else {
            repeat(-next - 1) { ballon.addFirst(ballon.removeLast()) }
            ballon.removeLast()
        }
        sb.append(temp[0]).append(' ')
        next = temp[1]
    }
    println(sb)
}
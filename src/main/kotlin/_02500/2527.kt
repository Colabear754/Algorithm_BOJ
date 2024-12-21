package _02500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(4) {
        val st = StringTokenizer(readLine())
        val (x1, y1, p1, q1) = IntArray(4) { st.nextToken().toInt() }
        val (x2, y2, p2, q2) = IntArray(4) { st.nextToken().toInt() }
        bw.write(
            when {
                (p1 < x2 || p2 < x1 || q1 < y2 || q2 < y1) -> "d\n"
                (p1 == x2 && q1 == y2) || (p2 == x1 && q1 == y2) || (p1 == x2 && q2 == y1) || (p2 == x1 && q2 == y1) -> "c\n"
                (p1 == x2 || p2 == x1 || q1 == y2 || q2 == y1) -> "b\n"
                else -> "a\n"
            }
        )
    }
    bw.close()
}
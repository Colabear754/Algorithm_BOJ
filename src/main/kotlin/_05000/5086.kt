package _05000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var st: StringTokenizer
    while (readLine().also { st = StringTokenizer(it) } != "0 0") {
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write(when {
            a % b == 0 -> "multiple\n"
            b % a == 0 -> "factor\n"
            else -> "neither\n"
        })
    }
    bw.close()
}
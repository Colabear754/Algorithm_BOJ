package _04500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var st: StringTokenizer
    while (readLine().also { st = StringTokenizer(it) } != "0") {
        val list = ArrayList<String>()
        st.apply { repeat(nextToken().toInt()) { nextToken().also { if (list.lastOrNull() != it) list.add(it) } } }
        bw.write("${list.joinToString(" ")} $\n")
    }
    bw.close()
}
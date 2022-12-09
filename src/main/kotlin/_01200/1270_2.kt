package _01200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val military = HashMap<Long, Int>()
    repeat(readLine().toInt()) {
        System.gc()
        val st = StringTokenizer(readLine())
        val t = st.nextToken().toInt()
        var max = 0
        var strongest = 0L
        repeat(t) {
            st.nextToken().toLong().also {
                military[it] = military[it]?.plus(1) ?: 1
                if ((military[it] ?: 0) > max) {
                    max = maxOf(max, military[it] ?: 0)
                    strongest = it
                }
            }
        }
        sb.append(if (max > t / 2) "$strongest\n" else "SYJKGW\n")
        military.clear()
    }
    println(sb)
}
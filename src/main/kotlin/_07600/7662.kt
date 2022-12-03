package _07600

import java.util.StringTokenizer
import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var st: StringTokenizer
    var n: Long
    repeat(readLine().toInt()) {
        val ts = TreeSet<Long>()
        val cntMap = HashMap<Long, Int>()
        for (i in 1..readLine().toInt()) {
            st = StringTokenizer(readLine())
            when (st.nextToken(" ")) {
                "I" -> {
                    ts.add(st.nextToken(" ").toLong().also { n = it })
                    cntMap[n] = cntMap.getOrDefault(n, 0) + 1
                }
                "D" -> {
                    if (ts.isEmpty()) continue
                    val key = if (st.nextToken() == "1") ts.last() else ts.first()
                    val cnt = cntMap[key]!! - 1
                    cntMap[key] = cnt
                    if (cnt == 0) ts.remove(key)
                }
            }
        }

        sb.append("${if (ts.isEmpty()) "EMPTY" else "${ts.last()} ${ts.first()}"}\n")
    }
    println(sb)
}
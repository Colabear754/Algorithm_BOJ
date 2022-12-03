package _07600

import java.util.StringTokenizer
import java.util.TreeMap

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var st: StringTokenizer
    var n: Long
    repeat(readLine().toInt()) {
        val tm = TreeMap<Long, Int>()
        repeat(readLine().toInt()) {
            st = StringTokenizer(readLine())
            when (st.nextToken(" ")) {
                "I" -> tm[st.nextToken(" ").toLong().also { n = it }] = tm.getOrDefault(n, 0) + 1
                "D" -> {
                    if (tm.isNotEmpty()) {
                        val key = if (st.nextToken() == "1") tm.lastKey() else tm.firstKey()
                        if (tm[key] == 1) tm.remove(key)
                        else tm[key] = tm[key]!! - 1
                    }
                }
            }
        }

        sb.append("${if (tm.isEmpty()) "EMPTY" else "${tm.lastKey()} ${tm.firstKey()}"}\n")
    }
    println(sb)
}
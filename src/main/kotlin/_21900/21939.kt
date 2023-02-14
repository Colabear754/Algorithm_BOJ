package _21900

import java.util.StringTokenizer
import java.util.TreeSet

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val difficulty = IntArray(100001)
    val problems = TreeSet<Int> { o1, o2 -> if (difficulty[o1] == difficulty[o2]) o2 - o1 else difficulty[o2] - difficulty[o1] }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            problems.add(nextToken().toInt().also { n -> difficulty[n] = nextToken().toInt() })
        }
    }
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "recommend" -> bw.write(if (st.nextToken() == "1") "${problems.first()}\n" else "${problems.last()}\n")
            "add" -> problems.add(st.nextToken().toInt().also { n -> difficulty[n] = st.nextToken().toInt() })
            "solved" -> {
                val n = st.nextToken().toInt()
                problems.remove(n)
                difficulty[n] = 0
            }
        }
    }
    bw.close()
}
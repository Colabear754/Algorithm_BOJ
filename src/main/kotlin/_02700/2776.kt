package _02700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        readLine()
        val note1 = HashSet<Int>().apply { StringTokenizer(readLine()).apply { while (hasMoreTokens()) add(nextToken().toInt()) } }
        readLine()
        StringTokenizer(readLine()).apply {
            while (hasMoreTokens()) {
                bw.write(if (note1.contains(nextToken().toInt())) "1\n" else "0\n")
            }
        }
    }
    bw.close()
}
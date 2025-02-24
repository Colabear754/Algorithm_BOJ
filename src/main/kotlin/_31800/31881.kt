package _31800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val isInfested = BooleanArray(n + 1)
    var count = n
    repeat(q) {
        StringTokenizer(readLine()).run {
            when (nextToken()) {
                "1" -> nextToken().toInt().let { if (!isInfested[it]) isInfested[it] = true.also { count-- } }
                "2" -> nextToken().toInt().let { if (isInfested[it]) isInfested[it] = false.also { count++ } }
                "3" -> bw.write("$count\n")
            }
        }
    }
    bw.close()
}
package _12800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var (h, m, s) = readLine().split(' ').map { it.toInt() }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> {
                    val t = nextToken().toInt()
                    s += t
                    m += s / 60
                    s %= 60
                    h += m / 60
                    m %= 60
                    h %= 24
                }
                "2" -> {
                    val current = ((h * 3600 + m * 60 + s - nextToken().toInt()) % 86400).let { if (it < 0) it + 86400 else it }
                    h = current / 3600
                    m = (current % 3600) / 60
                    s = current % 60
                }
                "3" -> bw.write("$h $m $s\n")
            }
        }
    }
    bw.close()
}
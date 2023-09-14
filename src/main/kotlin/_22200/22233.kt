package _22200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val keywords = HashSet<String>().apply { repeat(n) { add(readLine()) } }
    repeat(m) {
        StringTokenizer(readLine(), ",").apply { while (hasMoreTokens()) keywords.remove(nextToken()) }
        bw.write("${keywords.size}\n")
    }
    bw.close()
}
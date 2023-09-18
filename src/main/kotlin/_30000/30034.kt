package _30000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val delimiters = StringTokenizer(readLine()).run { HashSet<Char>().apply { repeat(n) { add(nextToken()[0]) } } }
    val m = readLine().toInt()
    StringTokenizer(readLine()).apply { repeat(m) { delimiters.add(nextToken()[0]) } }
    val k = readLine().toInt()
    StringTokenizer(readLine()).apply { repeat(k) { delimiters.remove(nextToken()[0]) } }
    readLine()
    delimiters.add(' ')
    StringTokenizer(readLine(), delimiters.joinToString("")).apply {
        while (hasMoreTokens()) bw.write("${nextToken()}\n")
    }
    bw.close()
}
package _17200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val passwordMap = HashMap<String, String>()
    val bw = System.out.bufferedWriter()
    StringTokenizer(readLine()).run {
        repeat(nextToken().toInt()) {
            StringTokenizer(readLine()).run { passwordMap[nextToken()] = nextToken() }
        }
        repeat(nextToken().toInt()) {
            bw.write("${passwordMap[readLine()]}\n")
        }
    }
    bw.close()
}
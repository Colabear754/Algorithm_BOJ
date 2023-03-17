package _13100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            nextToken()
            bw.write("god")
            while (hasMoreTokens()) {
                bw.write(nextToken())
            }
        }
        bw.newLine()
    }
    bw.close()
}
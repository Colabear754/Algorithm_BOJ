package _10800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cards = HashSet<Int>()
    readLine()
    StringTokenizer(readLine()).run {
        while(hasMoreTokens()) {
            cards.add(nextToken().toInt())
        }
    }
    readLine()
    StringTokenizer(readLine()).run {
        while(hasMoreTokens()) {
            bw.write(if (cards.contains(nextToken().toInt())) "1 " else "0 ")
        }
    }
    bw.close()
}
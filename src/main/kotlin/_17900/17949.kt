package _17900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val cryptogram = readLine()
    val n = readLine().toInt()
    var current = 0
    StringTokenizer(readLine()).apply { repeat(n) {
        bw.write("${cryptogram.substring(current, when (nextToken()) {
            "char" -> (current + 2).also { current += 2 }
            "int" -> (current + 8).also { current += 8 }
            else -> (current + 16).also { current += 16 }
        }).toLong(16)} ")
    } }
    bw.close()
}
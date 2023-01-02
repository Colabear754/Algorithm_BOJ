package _18900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var sum = 0L
    var XOR = 0L
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            when (nextToken()) {
                "1" -> {
                    nextToken().toLong().also { n ->
                        sum += n
                        XOR = XOR xor n
                    }
                }
                "2" -> {
                    nextToken().toLong().also { n ->
                        sum -= n
                        XOR = XOR xor n
                    }
                }
                "3" -> bw.write("${sum}\n")
                "4" -> bw.write("${XOR}\n")
            }
        }
    }
    bw.close()
}
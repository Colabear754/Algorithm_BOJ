package _18100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var memory = 0b11_1111_1111_1111_1111_1111_1111
    val strings = IntArray(n) { readLine().fold(0) { acc, c -> acc or (1 shl (c - 'a')) } }

    repeat(m) {
        var count = 0
        StringTokenizer(readLine()).apply {
            nextToken()
            memory = memory xor (1 shl (nextToken()[0] - 'a'))
        }
        for (str in strings) {
            if (str and memory == str) count++
        }
        bw.write("$count\n")
    }
    bw.close()
}

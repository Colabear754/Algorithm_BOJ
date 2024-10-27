package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val flipCases = intArrayOf(0b100100100, 0b010010010, 0b001001001, 0b100010001, 0b001010100, 0b111000000, 0b000111000, 0b000000111)
    repeat(readLine().toInt()) {
        val arr = Array(3) { StringTokenizer(readLine()).run { IntArray(3) { if (nextToken() == "H") 1 else 0 } } }
        var coins = 0
        for (i in 0..2) {
            for (j in 0..2) {
                coins = (coins shl 1) or arr[i][j]
            }
        }
        val queue = ArrayDeque<Pair<Int, Int>>()
        val visited = HashSet<Int>()
        queue.add(coins to 0)
        visited.add(coins)
        while (queue.isNotEmpty()) {
            val (current, count) = queue.removeFirst()
            if (current == 0 || current == 0b111111111) {
                bw.write("$count")
                bw.newLine()
                return@repeat
            }
            for (flipCase in flipCases) {
                val next = current xor flipCase
                if (visited.add(next)) {
                    queue.add(next to count + 1)
                }
            }
        }
        bw.write("-1\n")
    }
    bw.close()
}
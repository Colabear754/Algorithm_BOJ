package _14600

import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val mod = 1_000_000_007
    repeat(readLine().toInt()) {
        val slimes = PriorityQueue<Long>()
        readLine()
        StringTokenizer(readLine()).apply { while (hasMoreTokens()) slimes.add(nextToken().toLong()) }
        var cost = 1L
        while (slimes.size > 1) {
            val slime1 = slimes.poll()
            val slime2 = slimes.poll()
            val newSlime = slime1 * slime2
            slimes.add(newSlime)
            cost *= (slime1 % mod * slime2 % mod) % mod
            cost %= mod
        }
        bw.write("${cost}\n")
    }
    bw.close()
}
package _09200

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val home = StringTokenizer(readLine()).toIntArray()
        val convenienceStores = Array(n) { StringTokenizer(readLine()).toIntArray() }
        val festival = StringTokenizer(readLine()).toIntArray()
        val queue = ArrayDeque<IntArray>().apply { add(home) }
        val visited = BooleanArray(n)
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (abs(current[0] - festival[0]) + abs(current[1] - festival[1]) <= 1000) {
                bw.write("happy\n")
                return@repeat
            }
            for (i in convenienceStores.indices) {
                if (visited[i]) continue
                if (abs(current[0] - convenienceStores[i][0]) + abs(current[1] - convenienceStores[i][1]) <= 1000) {
                    visited[i] = true
                    queue.add(convenienceStores[i])
                }
            }
        }
        bw.write("sad\n")
    }
    bw.close()
}

private fun StringTokenizer.toIntArray() = IntArray(2) { nextToken().toInt() }
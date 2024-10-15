package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val isPrime = BooleanArray(10000) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..99) {
        if (isPrime[i]) {
            for (j in i * i..isPrime.lastIndex step i) isPrime[j] = false
        }
    }
    val digits = intArrayOf(1000, 100, 10, 1)
    repeat(readLine().toInt()) {
        val (a, b) = StringTokenizer(readLine()).run { IntArray(2) { nextToken().toInt() } }
        val visited = BooleanArray(10000)
        visited[a] = true
        val queue = ArrayDeque<Int>().apply { add(a) }
        var count = 0
        loop@ while (queue.isNotEmpty()) {
            for (i in 0..<queue.size) {
                val current = queue.removeFirst()
                if (current == b) break@loop
                for (j in 0..9) {
                    for (k in 0..3) {
                        if (k == 0 && j == 0) continue
                        val next = current + (j - (current / digits[k] % 10)) * digits[k]
                        if (isPrime[next] && !visited[next]) {
                            visited[next] = true
                            queue.add(next)
                        }
                    }
                }
            }
            count++
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
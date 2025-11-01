package _14600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k, q) = readLine().split(' ').map { it.toInt() }
    val isRead = BooleanArray(n).also { it[0] = true }
    val readCount = IntArray(q)
    val sendName = CharArray(q)
    repeat(q) {
        StringTokenizer(readLine()).apply {
            readCount[it] = nextToken().toInt()
            sendName[it] = nextToken()[0]
        }
    }
    if (readCount.last() == 0) return@with println(-1)
    for (i in 0..<q) {
        if (readCount.last() <= readCount[i]) isRead[sendName[i] - 'A'] = true
    }
    repeat(k - q) {
        StringTokenizer(readLine()).apply {
            nextToken()
            isRead[nextToken()[0] - 'A'] = true
        }
    }
    println((0..<n).filter { !isRead[it] }.joinToString(" ") { "${'A' + it}" })
}
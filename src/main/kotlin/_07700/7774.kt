package _07700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val a = StringTokenizer(readLine()).toIntArray(n)
    val b = StringTokenizer(readLine()).toIntArray(m)
    var aSocket = 1
    var bSocket = 0
    var aIndex = 0
    var bIndex = 0
    var result = 0
    while (true) {
        if (bSocket > 0 && bIndex < m) {
            bSocket--
            aSocket += b[bIndex++]
            result = aSocket
            continue
        }
        if (aSocket > 0 && aIndex < n) {
            aSocket--
            bSocket += a[aIndex++]
            continue
        }
        break
    }
    println(result)
}

private fun StringTokenizer.toIntArray(size: Int) = IntArray(size) { nextToken().toInt() }.sortedArrayDescending()
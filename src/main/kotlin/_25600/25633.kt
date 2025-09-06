package _25600

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val array = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var maxCount = 0
    for (i in 0..<n) {
        if (n - i <= maxCount) break
        var sum = array[i]
        var count = 1
        for (j in i + 1..<n) {
            if (count + n - j <= maxCount) break
            if (sum >= array[j]) {
                sum += array[j]
                count++
            }
        }
        maxCount = maxOf(maxCount, count)
    }
    println(maxCount)
}
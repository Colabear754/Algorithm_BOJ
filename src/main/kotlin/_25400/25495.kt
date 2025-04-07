package _25400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val a = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var sum = 2
    var usage = 2
    for (i in 1..<n) {
        usage = if (a[i] == a[i - 1]) usage * 2 else 2
        sum += usage
        if (sum >= 100) {
            sum = 0
            usage = 1
        }
    }
    println(sum)
}
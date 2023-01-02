package _25400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    var (p, n) = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }.sortedArray()
    var count = 0
    while (p < 200 && count <= arr.lastIndex) {
        p += arr[count++]
    }
    println(count)
}
package _11300

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val time = IntArray(n) { st.nextToken().toInt() }.sortedArray()
    var sum = 0
    var result = 0
    for (t in time) {
        sum += t
        result += sum
    }
    println(result)
}
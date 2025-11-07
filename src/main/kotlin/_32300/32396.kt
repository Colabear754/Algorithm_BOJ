package _32300

import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toLong()
    val array = StringTokenizer(readLine()).run { LongArray(n) { nextToken().toLong() } }
    if (n <= 1) {
        return@with println(0)
    }
    val needChange = BooleanArray(n - 1) { abs(array[it] - array[it + 1]) < m }
    var keep = 0
    var i = 0
    while (i < n) {
        if (i >= n - 1 || !needChange[i]) {
            keep++
            i++
            continue
        }
        var j = i
        while (j < n - 1 && needChange[j]) j++
        keep += (j - i + 2) / 2
        i = j + 1
    }
    println(n - keep)
}
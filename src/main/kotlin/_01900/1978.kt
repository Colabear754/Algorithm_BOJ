package _01900

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }
    var cnt = 0
    root@ for (k in arr) {
        for (i in 2 until k) {
            if (k % i == 0) {
                continue@root
            }
        }
        cnt++
    }
    println(cnt - arr.count { it == 1 })
}
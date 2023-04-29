package _13100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    val check = BooleanArray(100001)
    var start = 0
    var end = 0
    var result = 0L
    while (start < n) {
        while (end < n && !check[arr[end]]) {
            check[arr[end]] = true
            end++
        }
        result += end - start
        check[arr[start]] = false
        start++
    }
    println(result)
}
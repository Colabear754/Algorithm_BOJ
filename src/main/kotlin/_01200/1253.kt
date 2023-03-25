package _01200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() }.sorted() }
    var good = 0
    for (i in arr.indices) {
        var start = 0
        var end = n - 1
        while (start < end) {
            val sum = arr[start] + arr[end]
            if (sum == arr[i]) {
                if (i == start) start++
                else if (i == end) end--
                else {
                    good++
                    break
                }
            }
            if (sum < arr[i]) start++
            else if (sum > arr[i]) end--
        }
    }
    println(good)
}
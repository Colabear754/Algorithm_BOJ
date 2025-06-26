package _24000

import java.util.StringTokenizer

private var result = -1
private var cnt = 0
private var k = 0
private val sorted = IntArray(500000)

fun main() = with(System.`in`.bufferedReader()) {
    val n: Int
    readLine().split(' ').map { it.toInt() }.also { n = it[0]; k = it[1] }
    val st = StringTokenizer(readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }
    mergeSort(arr, 0, n - 1)
    println(result)
}

private fun mergeSort(arr: IntArray, p: Int, r: Int) {
    if (result != -1) return
    if (p < r) {
        val q = (p + r) / 2
        mergeSort(arr, p, q)
        mergeSort(arr, q + 1, r)
        merge(arr, p, q, r)
    }
}

private fun merge(arr: IntArray, p: Int, q: Int, r: Int) {
    if (result != -1) return
    var i = p
    var j = q + 1
    var t = 0
    while (i <= q && j <= r) {
        if (arr[i] <= arr[j]) sorted[t++] = arr[i++]
        else sorted[t++] = arr[j++]
    }
    while (i <= q) sorted[t++] = arr[i++]
    while (j <= r) sorted[t++] = arr[j++]
    i = p
    t = 0
    while (i <= r) {
        if (++cnt == k) {
            result = sorted[t]
            break
        }
        arr[i++] = sorted[t++]
    }
}
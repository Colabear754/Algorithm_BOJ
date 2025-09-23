package _28000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val starts = IntArray(n)
    val ends = IntArray(n)
    repeat(n) { StringTokenizer(readLine()).run { starts[it] = nextToken().toInt(); ends[it] = nextToken().toInt() } }
    starts.sort()
    ends.sort()
    val q = readLine().toInt()
    StringTokenizer(readLine()).run {
        repeat(q) { nextToken().toInt().let { bw.appendLine("${starts.upperBound(it) - ends.upperBound(it - 1)}") } }
    }
    bw.close()
}

private fun IntArray.upperBound(value: Int): Int {
    var left = 0
    var right = size
    while (left < right) {
        val mid = (left + right) shr 1
        if (this[mid] <= value) left = mid + 1 else right = mid
    }
    return left
}
package _05400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    loop@ for (i in 1..readLine().toInt()) {
        var isReversed = false
        val p = readLine()
        val n = readLine().toInt()
        val arr = StringTokenizer(readLine().run { slice(1 until lastIndex) }).run { IntArray(n) { nextToken(",").toInt() } }
        var start = 0
        var end = n - 1
        for (c in p) {
            when (c) {
                'R' -> isReversed = !isReversed
                'D' -> {
                    if (start > end) {
                        bw.write("error\n")
                        continue@loop
                    }
                    if (isReversed) end--
                    else start++
                }
            }
        }
        val result = arr.sliceArray(start..end)
        if (isReversed) result.reverse()
        bw.write("[${result.joinToString(",")}]\n")
    }
    bw.close()
}
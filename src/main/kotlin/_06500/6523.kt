package _06500

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var input: String
    while (readLine().also { input = it } != "0") {
        val (n, a, b) = StringTokenizer(input).run { IntArray(3) { nextToken().toInt() } }
        val count = HashMap<Int, Int>()
        var drink = 0
        var next = b
        while (true) {
            count[next] = (count[next] ?: 0) + 1
            if (count[next] == 3) break
            if (count[next] == 2) drink++
            next = ((((a.toLong() * next) % n) * next + b) % n).toInt()
        }
        bw.write("${n - drink}")
        bw.newLine()
        System.gc()
    }
    bw.close()
}
package _09000

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val r = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
        val s = IntArray(n)
        val isUsed = BooleanArray(n + 1)
        for (i in n - 1 downTo 0) {
            var count = 0
            var placed = false
            for (j in 1..n) {
                if (isUsed[j]) continue
                if (count == r[i]) {
                    s[i] = j
                    isUsed[j] = true
                    placed = true
                    break
                }
                count++
            }
            if (!placed) {
                bw.write("IMPOSSIBLE\n")
                return@repeat
            }
        }
        bw.write("${s.joinToString(" ")}\n")
    }
    bw.close()
}
package _17800

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val n = st.nextToken().toInt()
        val bin = st.nextToken()
        val indexOfQ = bin.indexOf('?')
        val indexOf1 = bin.indexOf('1')
        var countQ = 0
        var count1 = 0
        for (c in bin) {
            when (c) {
                '1' -> count1++
                '?' -> countQ++
            }
        }
        val max = if (indexOfQ < 0 || indexOf1 < 0) n + (bin.length - maxOf(indexOfQ, indexOf1)) else n + (bin.length - minOf(indexOfQ, indexOf1))
        val min = n + (bin.length - indexOf1)
        bw.write(if (count1 + countQ == 0) "1 " else if (count1 + countQ == 1) "${max - 1} " else "$max ")
        bw.write(if (count1 == 0) "1\n" else if (count1 == 1) "${min - 1}\n" else "$min\n")
    }
    bw.close()
}
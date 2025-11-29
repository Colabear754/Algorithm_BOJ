package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.`out`.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toCharArray()
        var i = n.size - 2
        while (i >= 0 && n[i] >= n[i + 1]) i--
        if (i < 0) {
            return@repeat bw.appendLine("BIGGEST").run {}
        }
        var j = n.size - 1
        while (n[j] <= n[i]) j--
        n[i] = n[j].also { n[j] = n[i] }
        var left = i + 1
        var right = n.size - 1
        while (left < right) {
            n[left] = n[right].also { n[right] = n[left] }
            left++
            right--
        }
        bw.appendLine(n.joinToString(""))
    }
    bw.close()
}
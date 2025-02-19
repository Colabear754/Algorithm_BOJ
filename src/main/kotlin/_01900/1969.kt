package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val count = Array(m) { IntArray(26) }
    repeat(n) { readLine().forEachIndexed { i, c -> count[i][c - 'A']++ } }
    val sb = StringBuilder()
    var sum = 0
    repeat(m) {
        var max = 0
        var maxIndex = 0
        for (i in 0..<26) {
            if (count[it][i] > max) {
                max = count[it][i]
                maxIndex = i
            }
        }
        sb.append('A' + maxIndex)
        sum += n - max
    }
    println("$sb\n$sum")
}
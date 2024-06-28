package _22300

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val (a, b) = Array(2) { readLine() }
        val size = maxOf(a.length, b.length)
        val aValue = a.calc(size)
        val bValue = b.calc(size)
        when {
            aValue > bValue -> bw.write(">")
            aValue < bValue -> bw.write("<")
            else -> bw.write("=")
        }
        bw.newLine()
    }
    bw.close()
}

private fun String.calc(size: Int): String {
    val count = IntArray(length / 2 + 1)
    var index = 0
    for (i in indices) {
        if (this[i] == '(') {
            index++
            continue
        }
        index--
        if (this[i - 1] == '(') count[index]++
    }
    val result = ArrayDeque<Int>()
    for ((i, v) in count.withIndex()) {
        if (i == length / 2) continue
        count[i + 1] += v shr 1
        result.addFirst(v and 1)
    }
    return result.joinToString("").padStart(size, '0')
}
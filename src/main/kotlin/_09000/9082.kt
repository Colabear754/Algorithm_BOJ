package _09000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val numbers = readLine().map { it - '0' }.toIntArray()
        readLine()
        var count = 0
        repeat(n) { i ->
            val checkRange = maxOf(0, i - 1)..minOf(n - 1, i + 1)
            if (checkRange.all { j -> numbers[j] > 0 }) {
                checkRange.forEach { j -> numbers[j]-- }
                count++
            }
        }
        bw.write("$count")
        bw.newLine()
    }
    bw.close()
}
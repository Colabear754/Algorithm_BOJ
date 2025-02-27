package _03000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        var n = readLine().toInt()
        val digits = ArrayDeque<Int>()
        while (n != 0) {
            val remainder = n % 3
            n /= 3
            if (remainder == 2) {
                digits.addFirst(-1)
                n++
                continue
            }
            if (remainder == -2) {
                digits.addFirst(1)
                n--
                continue
            }
            digits.addFirst(remainder)
        }
        bw.write(if (digits.isEmpty()) "0" else digits.joinToString("") { if (it == -1) "-" else "$it"})
        bw.newLine()
    }
    bw.close()
}
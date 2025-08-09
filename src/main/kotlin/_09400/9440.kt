package _09400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    lateinit var st: StringTokenizer
    while (readLine().also { st = StringTokenizer(it) } != "0") {
        val n = st.nextToken().toInt()
        val numbers = IntArray(n) { st.nextToken().toInt() }.sortedArray()
        val a = StringBuilder()
        val b = StringBuilder()
        var zero = numbers.count { it == 0 }
        var current = zero
        a.append(numbers[current++])
        b.append(numbers[current++])
        var isA = true
        while (zero > 0) {
            if (isA) a.append(0) else b.append(0)
            zero--
            isA = !isA
        }
        while (current < n) {
            if (isA) a.append(numbers[current++]) else b.append(numbers[current++])
            isA = !isA
        }
        bw.write("${a.toString().toInt() + b.toString().toInt()}")
        bw.newLine()
    }
    bw.close()
}
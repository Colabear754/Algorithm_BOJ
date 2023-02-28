package _10400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("${b.cumulateXOR() xor (a - 1).cumulateXOR()}\n")
    }
    bw.close()
}

private fun Int.cumulateXOR() = when (this % 4) {
    0 -> this
    1 -> 1
    2 -> this + 1
    else -> 0
}
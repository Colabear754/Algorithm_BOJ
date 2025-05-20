package _28200

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val m = readLine().toLong()
        bw.write(solution(m))
    }
    bw.close()
}

private val Long.log2 get() = 63 - countLeadingZeroBits()
private val Long.lowLog2 get() = takeLowestOneBit().log2
private val Long.highLog2 get() = takeHighestOneBit().log2

private fun solution(m: Long): String {
    if (m == 1L) return "0 0\n"
    when (m.countOneBits()) {
        1 -> return "${m.log2 - 1} ${m.log2 - 1}\n"
        2 -> return "${m.lowLog2} ${m.highLog2}\n"
        else -> {
            val up = StringBuilder("1")
            val down = StringBuilder("1")
            val toString = m.toString(2)
            for (i in 1..<toString.length) {
                if (toString[i] == '1') {
                    up.append(1).append("1".repeat(toString.length - i - 1))
                    down.append(1).append("0".repeat(toString.length - i - 1))
                    break
                }
                up.append(toString[i])
                down.append(toString[i])
            }
            val upLong = up.toString().toLong(2) + 1
            val downLong = down.toString().toLong(2)
            return if (upLong - m < m - downLong) solution(upLong) else solution(downLong)
        }
    }
}
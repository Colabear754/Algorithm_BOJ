package _03100

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val p = st.nextToken().toInt()
    val n = LongArray(4) { st.nextToken().toLong() }
    println(n.joinToString(" ") {
        if (p == 2) return@joinToString if (it == 3L || it == 4L) "1" else "0"
        val digits = IntArray(60)
        var index = 0
        var num = it
        while (num > 0) {
            (num % p).toInt().also { remainder ->
                if (remainder > 2) return@joinToString "0"
                digits[index++] = remainder
            }
            num /= p
        }
        if (index == 0) return@joinToString "0"
        val lastDigit = digits[index - 1]
        val subDigits = digits.copyOfRange(0, index - 1)
        val countOne = subDigits.count { d -> d == 1 }
        if (
            when (lastDigit) {
                2 -> countOne == 1
                1 -> if (subDigits.any { d -> d == 2 }) countOne == 0 else countOne == 1
                else -> false
            }
        ) "1" else "0"
    })
}
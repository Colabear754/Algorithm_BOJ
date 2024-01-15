package _09500

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toLong() }
    val count = LongArray(55)
    count[0] = 1
    for (i in 1..<55) {
        count[i] = count[i - 1] * 2 + (1L shl i)
    }
    println(count.calcOnebBits(b) - count.calcOnebBits(a - 1))
}

private fun LongArray.calcOnebBits(x: Long): Long {
    var n = x
    var result = x and 1
    for (i in 54 downTo 1) {
        val power = 1L shl i
        if (x and power != 0L) {
            result += this[i - 1] + (n - (power - 1))
            n -= power
        }
    }
    return result
}
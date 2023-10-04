package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong().toString(2)
    var exponent = n.lastIndex
    var result = 0L
    for (bit in n) {
        if (bit == '1') result += 3.pow(exponent)
        exponent--
    }
    println(result)
}

private fun Int.pow(n: Int): Long {
    var result = 1L
    repeat(n) { result *= this }
    return result
}
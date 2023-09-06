package _01400

fun main() = print(readln().split(' ').map { it.toLong() }.let { (a, b) -> sumOfMeasure(b) - sumOfMeasure(a - 1) })

private fun sumOfMeasure(n: Long): Long =
    if (n == 0L) 0
    else if (n == 1L) 1
    else if (n % 2 == 1L) n / 2 + 2 * sumOfMeasure(n / 2) + 1
    else n / 2 + 2 * sumOfMeasure(n / 2)
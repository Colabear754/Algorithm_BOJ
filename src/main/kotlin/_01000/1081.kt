package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val (l, u) = readLine().split(' ').map { it.toInt() }
    print(sum(u) - sum(l - 1))
}

private fun sum(n: Int): Long {
    val numberCounts = LongArray(10)
    var current = n
    var numberOfDigits = 1L
    var sum = 0L
    while (current > 0) {
        val next = current / 10
        current %= 10
        numberCounts[0] += next * numberOfDigits

        for (i in 1..current) numberCounts[i] += (next + 1) * numberOfDigits
        for (i in current + 1..9) numberCounts[i] += next * numberOfDigits

        numberCounts[current] -= numberOfDigits - 1 - (n % numberOfDigits)
        numberOfDigits *= 10
        current = next
    }
    for (i in 0..9) {
        sum += i * numberCounts[i]
    }
    return sum
}
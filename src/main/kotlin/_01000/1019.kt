package _01000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val numberCounts = IntArray(10)
    var current = n
    var numberOfDigits = 1
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
    print(numberCounts.joinToString(" "))
}
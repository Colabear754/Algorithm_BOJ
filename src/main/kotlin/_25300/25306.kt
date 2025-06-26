package _25300

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toLong() }
    print(b.cumulateXOR() xor (a - 1).cumulateXOR())
}

private fun Long.cumulateXOR() = when (this % 4) {
    0L -> this
    1L -> 1
    2L -> this + 1
    else -> 0
}
package _02000

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toLong() }
    val fiveCount = n.countFivePower() - m.countFivePower() - (n - m).countFivePower()
    val twoCount = n.countTwoPower() - m.countTwoPower() - (n - m).countTwoPower()
    println(minOf(fiveCount, twoCount))
}

private fun Long.countFivePower(): Long {
    var count = 0L
    var n = this
    while (n >= 5) {
        count += n / 5
        n /= 5
    }
    return count
}

private fun Long.countTwoPower(): Long {
    var count = 0L
    var n = this
    while (n  >= 2) {
        count += n / 2
        n /= 2
    }
    return count
}
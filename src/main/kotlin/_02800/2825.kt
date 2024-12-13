package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val bitSize = 1 shl 10
    val bitChecker = IntArray(bitSize)
    repeat(n) {
        var bit = 0
        readLine().forEach { bit = bit or (1 shl (it - '0')) }
        bitChecker[bit]++
    }
    var result = 0L
    for (i in 1..<bitSize) {
        for (j in i + 1..<bitSize) {
            if (i and j != 0) result += bitChecker[i].toLong() * bitChecker[j]
        }
        if (bitChecker[i] > 1) result += bitChecker[i].toLong() * (bitChecker[i] - 1) / 2
    }
    println(result)
}
package _30000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val strings = List(3) { readLine() }
    val comparisonChars = strings.zipWithNext { a, b ->
        for (i in 0..<n) if (a[i] != b[i]) return@zipWithNext "HJS".indexOf(a[i]) to "HJS".indexOf(b[i])
        -1 to -1
    }
    println(if (listOf(
            intArrayOf(1, 2, 3), intArrayOf(1, 3, 2),
            intArrayOf(2, 1, 3), intArrayOf(2, 3, 1),
            intArrayOf(3, 1, 2), intArrayOf(3, 2, 1)
        ).any { case -> comparisonChars.all { it.first != -1 && case[it.first] < case[it.second] } }) "HJS! HJS! HJS!" else "Hmm...")
}
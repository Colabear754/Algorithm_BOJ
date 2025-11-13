package _03200

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val firstRank = mutableListOf<Int>()
    for (i in 1..n) {
        firstRank.add(readLine().toInt() - 1, i)
    }
    val finalRank = mutableListOf<Int>()
    for (i in m - 1 downTo 0) {
        finalRank.add(readLine().toInt() - 1, firstRank[i])
    }
    println(finalRank.slice(0..2).joinToString("\n"))
}
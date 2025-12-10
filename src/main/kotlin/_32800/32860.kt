package _32800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val supernova = if (m in 1..26) "${'A' + m - 1}" else (m - 27).let { "${'a' + it / 26}${'a' + it % 26}" }
    println("SN $n$supernova")
}
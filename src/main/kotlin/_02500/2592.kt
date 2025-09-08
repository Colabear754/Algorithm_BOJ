package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val numbers = IntArray(10) { readLine().toInt() }
    val counts = IntArray(101)
    numbers.forEach { counts[it / 10]++ }
    println("${numbers.sum() / 10}\n${counts.indexOf(counts.max()) * 10}")
}
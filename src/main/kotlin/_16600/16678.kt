package _16600

fun main() = with(System.`in`.bufferedReader()) {
    val honor = IntArray(readLine().toInt()) { readLine().toInt() }.sortedArray()
    var target = 1
    var hackers = 0L
    honor.map { if (it >= target) { hackers += it - target++ } }
    println(hackers)
}
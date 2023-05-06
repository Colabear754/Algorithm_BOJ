package _18100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n == 0) {
        println(0)
        return@with
    }
    val standard = n * 15
    val cutOff = if (standard % 100 >= 50) standard / 100 + 1 else standard / 100
    val difficulty = IntArray(n) { readLine().toInt() * 10 }.sortedArray()
    val average = difficulty.sliceArray(cutOff..n - 1 - cutOff).sum() / (n - 2 * cutOff)
    println(if (average % 10 >= 5) average / 10 + 1 else average / 10)
}
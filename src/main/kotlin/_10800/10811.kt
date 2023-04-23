package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var basket = IntArray(n + 1) { it }
    repeat(m) {
        val (i, j) = readLine().split(' ').map { it.toInt() }
        basket = basket.sliceArray(0 until i) + basket.sliceArray(i..j).reversedArray() + basket.sliceArray(j + 1..n)
    }
    println(basket.drop(1).joinToString(" "))
}
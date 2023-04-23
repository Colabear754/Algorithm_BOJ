package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val basket = IntArray(n + 1)
    repeat(m) {
        val (i, j, k) = readLine().split(' ').map { it.toInt() }
        for (l in i..j) basket[l] = k
    }
    println(basket.drop(1).joinToString(" "))
}
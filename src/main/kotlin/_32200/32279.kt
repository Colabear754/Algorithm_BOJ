package _32200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (p, q, r, s) = readLine().split(' ').map { it.toInt() }
    val array = IntArray(n + 1)
    array[1] = readLine().toInt()
    for (i in 2..n) {
        array[i] = if (i and 1 == 0) p * array[i / 2] + q else r * array[i / 2] + s
    }
    println(array.sum())
}
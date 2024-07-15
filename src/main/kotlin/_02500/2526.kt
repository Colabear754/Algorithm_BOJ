package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val (n, p) = readLine().split(' ').map { it.toInt() }
    val array = IntArray(1001)
    var count = 0
    var current = n
    while (array[current] < 2) {
        array[current] = count++
        current = current * n % p
    }
    println(count - array[current])
}
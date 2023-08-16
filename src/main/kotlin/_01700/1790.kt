package _01700

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    var digits = 1
    var count = 9L
    var result = 0L
    while (k > count * digits) {
        k -= count.toInt() * digits
        result += count
        digits++
        count *= 10
    }
    result += (k - 1) / digits + 1
    println(if (n < result) -1 else result.toString()[(k - 1) % digits])
}
package _31800

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toInt() }
    repeat(n - 1) { k /= 2 }
    println(k)
}
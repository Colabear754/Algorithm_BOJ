package _01600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    if (n % 2 == 0 || n % 5 == 0) {
        println(-1)
        return@with
    }
    var result = 1
    var num = 1
    while (num % n != 0) {
        num = (num * 10 + 1) % n
        result++
    }
    println(result)
}
package _13400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    var max = 0
    for (i in 1..k) {
        var num = n * i
        var reversed = 0
        while (num > 0) {
            reversed = reversed * 10 + num % 10
            num /= 10
        }
        max = maxOf(max, reversed)
    }
    println(max)
}
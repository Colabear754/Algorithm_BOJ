package _17600

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = minOf(10, n)
    for (i in 11..n) {
        var sum = 0
        var num = i
        while (num > 0) {
            sum += num % 10
            num /= 10
        }
        if (i % sum == 0) {
            result++
        }
    }
    println(result)
}
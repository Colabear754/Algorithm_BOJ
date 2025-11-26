package _16700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var max = 0
    var numeral = 0
    for (i in 2..n) {
        var number = n
        var sum = 0
        while (number > 0) {
            sum += number % i
            number /= i
        }
        if (sum > max) {
            max = sum
            numeral = i
        }
    }
    println("$max $numeral")
}
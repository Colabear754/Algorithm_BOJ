package _15800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var result = 0L
    var i = 2
    while (i < n) {
        val temp = (n - 1) / ((n - 1) / i)
        result += (temp - i + 1) * ((n - 1) / i + 1)
        i = temp + 1
    }
    println(result + n + if (n == 1) 0 else 1)
}
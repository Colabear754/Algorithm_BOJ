package _01900

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var dots = 5
    for (i in 2..n) {
        dots += 3 * i + 1
        dots %= 45678
    }
    println(dots)
}
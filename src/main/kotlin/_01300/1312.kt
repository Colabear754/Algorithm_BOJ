package _01300

fun main() = with(System.`in`.bufferedReader()) {
    var (a, b, n) = readLine().split(" ").map { it.toInt() }
    repeat(n) {
        a = (a % b) * 10
    }
    println(a / b)
}
package _26200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0.0
    repeat(n) {
        sum += 1.0 / (it + 1)
    }
    println(sum * n)
}
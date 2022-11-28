package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var tmp = n
    var sugar = n / 5
    tmp %= 5
    while (tmp in 1..n) {
        if (tmp % 3 != 0) {
            sugar--
            tmp += 5
        } else {
            sugar += tmp / 3
            tmp = 0
        }
    }
    if (tmp > 0) {
        sugar = -1
    }
    println(sugar)
}
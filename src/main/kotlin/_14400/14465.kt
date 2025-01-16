package _14400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k, b) = readLine().split(' ').map { it.toInt() }
    val broken = BooleanArray(n + 1)
    repeat(b) { broken[readLine().toInt()] = true }
    var needToFix = 0
    for (i in 1..k) {
        if (broken[i]) needToFix++
    }
    var result = needToFix
    for (i in k + 1..n) {
        if (broken[i]) needToFix++
        if (broken[i - k]) needToFix--
        result = minOf(result, needToFix)
    }
    println(result)
}
package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var mod = n
    var sugar = n / 5
    mod %= 5
    while (mod in 1..n) {
        if (mod % 3 != 0) {
            sugar--
            mod += 5
        } else {
            sugar += mod / 3
            mod = 0
        }
    }
    if (mod > 0) {
        sugar = -1
    }
    println(sugar)
}
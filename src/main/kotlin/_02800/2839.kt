package _02800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var rest = n
    var sugar = n / 5
    rest %= 5
    while (rest in 1..n) {
        if (rest % 3 != 0) {
            sugar--
            rest += 5
        } else {
            sugar += rest / 3
            rest = 0
        }
    }
    if (rest > 0) {
        sugar = -1
    }
    println(sugar)
}
package _26000

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    var sugar = n / 5
    var rest = n % 5
    while (rest in 1..n) {
        if (rest % 3 != 0L) {
            sugar--
            rest += 5
        } else {
            sugar += rest / 3
            rest = 0
        }
    }
    println(if (rest > n) -1 else sugar)
}
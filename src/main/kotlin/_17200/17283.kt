package _17200

fun main() = with(System.`in`.bufferedReader()) {
    var l = readLine().toInt()
    val r = readLine().toInt()
    var sum = 0
    var n = 1
    while (true) {
        l = l * r / 100
        if (l <= 5) {
            println(sum)
            return@with
        }
        n *= 2
        sum += l * n
    }
}
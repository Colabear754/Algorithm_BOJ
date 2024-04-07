package _23700

fun main() = with(System.`in`.bufferedReader()) {
    var sum = 0
    while (true) {
        val n = readLine().toInt()
        if (n == -1) break
        sum += n
    }
    println(sum)
}
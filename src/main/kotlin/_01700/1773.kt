package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val (n, c) = readLine().split(" ").map { it.toInt() }
    val fire = Array(n) { readLine().toInt() }
    val time = BooleanArray(c + 1)
    for (i in fire.indices) {
        for (j in fire[i] until c + 1 step fire[i]) {
            time[j] = true
        }
    }
    println(time.count { b -> b })
}
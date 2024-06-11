package _08300

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 0
    for (i in 1..n) {
        for (j in 1..i) {
            if (i * j > n) break
            count++
        }
    }
    println(count)
}
package _18100

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var count = 1
    var difference = 1
    for (i in 1..n) {
        count += difference
        if (i % 3 != 0) difference++
    }
    println(count)
}
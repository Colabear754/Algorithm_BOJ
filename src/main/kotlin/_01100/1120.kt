package _01100

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ')
    var min = 50
    for (i in 0..b.length - a.length) {
        var count = 0
        for (j in a.indices) {
            if (a[j] != b[i + j]) {
                count++
            }
        }
        min = minOf(min, count)
    }
    println(min)
}
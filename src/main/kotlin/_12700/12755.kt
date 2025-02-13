package _12700

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var length = 1
    var count = 9
    var start = 1
    while (n > length * count) {
        n -= length * count
        length++
        count *= 10
        start *= 10
    }
    start += (n - 1) / length
    println("$start"[(n - 1) % length])
}
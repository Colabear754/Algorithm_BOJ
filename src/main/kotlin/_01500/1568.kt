package _01500

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var s = 0
    var count = 0
    while (n > 0) {
        s++
        if (n < s) {
            s = 1
        }
        n -= s
        count++
    }
    println(count)
}
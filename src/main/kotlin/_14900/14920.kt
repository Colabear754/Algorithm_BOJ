package _14900

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var count = 1
    while (n != 1) {
        n = if (n and 1 == 0) n / 2 else n * 3 + 1
        count++
    }
    println(count)
}
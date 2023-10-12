package _27900

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toLong()
    var count = 0
    while (n > 1) {
        count++
        n = (n shr 1) + (n and 1)
    }
    println(count + n)
}
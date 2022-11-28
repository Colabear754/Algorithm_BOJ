package _02200

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt() - 1
    var route = 1
    while (n > 0) {
        n -= 6 * route++
    }
    println(route)
}
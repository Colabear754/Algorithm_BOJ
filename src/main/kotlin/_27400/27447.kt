package _27400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val customers = StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }
    var claywares = 0
    var coffee = 0
    var current = 0
    var next = 0
    var time = 0
    while (current < n) {
        if (time == customers[current]) {
            if (coffee == 0) {
                println("fail")
                return@with
            }
            coffee--
            current++
        } else if (next < n && customers[next] <= time + m && claywares > 0) {
            claywares--
            coffee++
            next++
        } else claywares++
        time++
    }
    println("success")
}
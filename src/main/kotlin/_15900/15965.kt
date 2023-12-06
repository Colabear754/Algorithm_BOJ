package _15900

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()
    val isPrime = BooleanArray(7368788) { true }
    isPrime[0] = false
    isPrime[1] = false
    val sqrt = sqrt(7368788.0).toInt()
    for (i in 2..sqrt) {
        if (isPrime[i]) {
            for (j in i * i..7368787 step i) {
                isPrime[j] = false
            }
        }
    }
    var count = 0
    for (i in 2..7368787) {
        if (isPrime[i]) {
            count++
            if (count == k) {
                println(i)
                break
            }
        }
    }
}
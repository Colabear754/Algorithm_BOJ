package _14700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var sum = 0
    var i = 1
    while (sum + i < n) {
        sum += i++
    }
    val a = n - sum
    val b = i - a + 1
    println("$b $a")
}
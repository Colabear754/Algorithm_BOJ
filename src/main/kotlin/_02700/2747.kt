package _02700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fibonacci = IntArray(n + 1)
    fibonacci[0] = 0
    fibonacci[1] = 1
    for (i in 2..n) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
    println(fibonacci[n])
}
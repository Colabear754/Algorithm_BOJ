package _24400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val fibonacci = IntArray(n + 1).also { it.also { it[2] = 1 }[1] = 1 }
    for (i in 3..n) {
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2])
    }
    println("${fibonacci[n]} ${n - 2}")
}
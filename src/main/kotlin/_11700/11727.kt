package _11700

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val cases = IntArray(n + 1)
    cases[0] = 1.also { cases[1] = it }
    for (i in 2..n) {
        cases[i] = (cases[i - 1] + cases[i - 2] * 2) % 10007
    }
    println(cases[n])
}
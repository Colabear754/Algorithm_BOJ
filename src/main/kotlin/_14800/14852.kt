package _14800

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val size = maxOf(n + 1, 3)
    val cases = LongArray(size)
    val sum = LongArray(size)
    cases[0] = 1
    sum[0] = 1
    cases[1] = 2
    sum[1] = 3
    cases[2] = 7
    sum[2] = 10
    for (i in 3..n) {
        cases[i] = (3 * cases[i - 2] + 2 * cases[i - 1] + 2 * sum[i - 3]) % 1000000007
        sum[i] = (sum[i - 1] + cases[i]) % 1000000007
    }
    println(cases[n])
}
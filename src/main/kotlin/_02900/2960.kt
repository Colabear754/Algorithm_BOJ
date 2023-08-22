package _02900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val isPrime = BooleanArray(n + 1) { true }
    var count = 0

    for (i in 2..n) {
        if (isPrime[i]) {
            for (j in i..n step i) {
                if (isPrime[j]) {
                    isPrime[j] = false
                    if (++count == k) {
                        println(j)
                        return@with
                    }
                }
            }
        }
    }
}
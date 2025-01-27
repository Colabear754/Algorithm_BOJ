package _15700

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    val primeFactorMap = mutableMapOf<Int, Int>()
    var divisor = 2
    while (divisor * divisor <= n) {
        while (n % divisor == 0) {
            primeFactorMap[divisor] = (primeFactorMap[divisor] ?: 0) + 1
            n /= divisor
        }
        divisor++
    }
    if (n > 1) primeFactorMap[n] = 1
    println(primeFactorMap.values.fold(1) { acc, i -> acc * (i + 1) })
}
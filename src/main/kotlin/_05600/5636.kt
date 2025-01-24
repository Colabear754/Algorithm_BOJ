package _05600

fun main() = with(System.`in`.bufferedReader()) {
    val isPrime = BooleanArray(100001) { true }
    isPrime[0] = false
    isPrime[1] = false
    var n = 2
    while (n * n < 100000) {
        if (isPrime[n]) {
            for (i in n * n..100000 step n) { isPrime[i] = false }
        }
        n++
    }
    val primes = ArrayDeque<Int>()
    isPrime.forEachIndexed { index, b -> if (b) primes.addFirst(index) }
    val bw = System.out.bufferedWriter()
    var input: String
    while (readLine().also { input = it } != "0") {
        for (prime in primes) {
            if ("$prime" in input) {
                bw.write("$prime")
                bw.newLine()
                break
            }
        }
    }
    bw.close()
}
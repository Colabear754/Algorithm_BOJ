package _10400

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val isPrime = BooleanArray(10001) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..100) {
        if (isPrime[i]) {
            for (j in i * i..10000 step i) {
                isPrime[j] = false
            }
        }
    }
    repeat(readLine().toInt()) {
        StringTokenizer(readLine()).apply {
            val n = nextToken()
            val m = nextToken().toInt()
            if (!isPrime[m]) return@repeat bw.write("$n $m NO\n")
            var sum = m
            val visited = mutableSetOf<Int>()
            while (sum != 1 && !visited.contains(sum)) {
                visited.add(sum)
                var current = 0
                while (sum > 0) {
                    val digit = sum % 10
                    current += digit * digit
                    sum /= 10
                }
                sum = current
            }
            bw.write("$n $m ${if (sum == 1) "YES" else "NO"}\n")
        }
    }
    bw.close()
}
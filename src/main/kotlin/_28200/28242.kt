package _28200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val n1 = n + 1
    val n2 = -(n + 2)
    for (i in -1000..1000) {
        if (i == 0 || n % i != 0) continue
        val c = n / i
        for (j in -1000..1000) {
            if (j == 0 || n2 % j != 0) continue
            val d = n2 / j
            if (i * d + j * c == n1) {
                return@with println("$i $j $c $d")
            }
        }
    }
    println(-1)
}
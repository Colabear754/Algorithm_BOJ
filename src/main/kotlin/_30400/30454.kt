package _30400

fun main() = with(System.`in`.bufferedReader()) {
    val (n, _) = readLine().split(' ').map { it.toInt() }
    val zebras = IntArray(n)
    var max = 0
    repeat(n) { i ->
        zebras[i] = readLine().run { replace("10", "-").count { it == '-' } + if (last() == '1') 1 else 0 }
        max = maxOf(max, zebras[i])
    }
    println("$max ${zebras.count { it == max }}")
}
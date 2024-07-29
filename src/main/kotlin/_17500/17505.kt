package _17500

fun main() = with(System.`in`.bufferedReader()) {
    var (n, k) = readLine().split(' ').map { it.toLong() }
    var start = 1
    var end = n.toInt()
    val result = IntArray(n.toInt())
    for (i in 1..n.toInt()) {
        if (k < n - i) {
            result[i - 1] = start++
            continue
        }
        k -= n - i
        result[i - 1] = end--
    }
    println(if (k != 0L || start <= end) -1 else result.joinToString(" "))
}
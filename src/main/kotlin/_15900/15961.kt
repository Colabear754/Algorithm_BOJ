package _15900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, d, k, c) = readLine().split(" ").map { it.toInt() }
    val check = IntArray(d + 1)
    var count = 0
    val sushi = IntArray(n) { i ->
        readLine().toInt().also {
            if (i < k) {
                if (check[it] == 0) count++
                check[it]++
            }
        }
    }
    var max = count
    for (i in 0..<n) {
        max = maxOf(max, if (check[c] == 0) count + 1 else count)
        check[sushi[i]]--
        if (check[sushi[i]] == 0) count--
        val next = (i + k) % n
        if (check[sushi[next]] == 0) count++
        check[sushi[next]]++
    }
    println(max)
}
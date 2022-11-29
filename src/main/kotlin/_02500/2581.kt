package _02500

fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val n = readLine().toInt()
    val check = BooleanArray(n + 1)
    check[0] = true
    check[1] = true
    var i = 2
    while (i * i <= n) {
        if (!check[i]) {
            var j = i * i
            while (j <= n) {
                check[j] = true
                j += i
            }
        }
        i++
    }
    var sum = 0
    var min = 10000
    for (j in m..n) {
        if (!check[j]) {
            sum += j
            min = minOf(min, j)
        }
    }
    if (sum == 0) {
        println(-1)
    } else {
        println("$sum\n$min")
    }
}
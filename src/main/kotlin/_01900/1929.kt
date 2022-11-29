package _01900

fun main() = with(System.out.bufferedWriter()) {
    val (m, n) = System.`in`.bufferedReader().readLine().split(' ').map { it.toInt() }
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
    for (j in m..n) {
        if (!check[j]) write("$j\n")
    }
    close()
}
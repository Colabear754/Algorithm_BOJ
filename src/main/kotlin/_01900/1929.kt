package _01900

fun main() = with(System.out.bufferedWriter()) {
    val (m, n) = System.`in`.bufferedReader().readLine().split(' ').map { it.toInt() }
    val check = BooleanArray(n + 1)
    check[0] = true
    check[1] = true
    var i = 2
    while (i * i <= n) {
        if (!check[i]) {
            for (j in i * i..n step i) {
                check[j] = true
            }
        }
        i++
    }
    for (j in m..n) {
        if (!check[j]) write("$j\n")
    }
    close()
}
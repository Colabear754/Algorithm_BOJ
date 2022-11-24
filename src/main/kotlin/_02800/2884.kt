package _02800

fun main() = with(System.`in`.bufferedReader()) {
    var (h, m) = readLine().split(' ').map { it.toInt() }
    if ((m - 45).also { m -= 45 } < 0) {
        m += 60
        if (--h < 0) {
            h += 24
        }
    }
    println("$h $m")
}
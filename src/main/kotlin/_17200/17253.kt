package _17200

fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toLong()
    if (n == 0L) {
        println("NO")
        return@with
    }
    var power = 1L
    while (power < n && power <= Long.MAX_VALUE / 3) power *= 3
    while (n > 0 && power > 0) {
        if (n >= power) n -= power
        power /= 3
    }
    println(if (n == 0L) "YES" else "NO")
}
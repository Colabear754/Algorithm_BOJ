package _10200

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val (h, w, n) = readLine().split(' ').map { it.toInt() }
        if (n % h == 0) sb.append("%d%2d\n".format(h, n / h).replace(" ", "0"))
        else sb.append("%d%2d\n".format(n % h, n / h + 1).replace(" ", "0"))
    }
    println(sb)
}
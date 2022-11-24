package _02500


fun main() = with(System.`in`.bufferedReader()) {
    var (h, m) = readLine().split(' ').map { it.toInt() }
    val timer = readLine().toInt()
    m += timer
    h = (h + m / 60) % 24
    m %= 60
    println("$h $m")
}